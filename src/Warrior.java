import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private List<Item> items;

    public Warrior(String name, int life, int speed, int muscle, List<Item> items) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.items = items;

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", speed=" + speed +
                ", muscle=" + muscle +
                ", item=" + items +
                '}';
    }

    private int getTotalForce() {
        return life + speed + muscle;
    }

    private Item removeHighestItem() {
        Item itemForCompare=items.get(0);
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).value>itemForCompare.value){
                itemForCompare=items.get(i);
            }
        }
        items.remove(itemForCompare);
        return itemForCompare;
    }

    public static void warOfWariors(Warrior warrior01, Warrior warrior02) {

        //create a list which help to move items
        ArrayList<Item> removedItem = new ArrayList<Item>();

        if(warrior01.getTotalForce() == 0 && warrior02.getTotalForce() == 0){

        }
        //if warrior02 is the winner
        if (warrior01.getTotalForce() < warrior02.getTotalForce()) {

            if (warrior01.items.size() == 1) {
                warrior01.items.add(warrior01.items.get(0));
            } else if (warrior01.items.size() == 0) {
                System.out.println("No one item to move");
            } else {
                warrior02.items.add(warrior01.removeHighestItem());
            }

        } else if (warrior01.getTotalForce() > warrior02.getTotalForce()) {
            if (warrior02.items.size() == 0) {
                System.out.println("No one item to move");
            }
            else {
                warrior01.items.add(warrior02.removeHighestItem());
            }

        } else if (warrior01.getTotalForce() == warrior02.getTotalForce()) {

        }
    }

    public static void main(String[] args) {
        //create items
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watches", 30);

        //create two warriors
        Warrior warrior1 = new Warrior("Warrior1", 9, 5, 7, Arrays.asList(items01, items03, items02));
        Warrior warrior2 = new Warrior("Warrior2", 9, 9, 8, Arrays.asList(items01, items03, items02));

        warOfWariors(warrior1, warrior2);
    }
}
