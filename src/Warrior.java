import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private ArrayList<Item> items;

    public Warrior(String name, int life, int speed, int muscle, ArrayList<Item> items) {
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

    private Item getHighestItem() {
        Item itemForCompare = items.get(0);
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).value > itemForCompare.value) {
                itemForCompare = items.get(i);
            }
        }
        //items.remove(itemForCompare);
        return itemForCompare;
    }

    public static void warOfWariors(Warrior warrior01 ,ArrayList<Item> warrior1Items, Warrior warrior02,ArrayList<Item> warrior2Items) {

        //if warrior02 is the winner
        if (warrior01.getTotalForce() < warrior02.getTotalForce()) {

            if (warrior01.items.size() == 1) {
                warrior2Items.add(warrior01.items.get(0));
                System.out.println(warrior01.items.get(0)+"from warrior01 was moved to warrior02");
                warrior1Items.remove(warrior01.items.get(0));

            } else if (warrior01.items.size() == 0) {
                System.out.println("No one item to move");
            } else {
                warrior2Items.add(warrior01.getHighestItem());
                System.out.println(warrior01.getHighestItem()+"from warrior01 was moved to warrior02");
                warrior1Items.remove(warrior01.getHighestItem());
            }
        //if warrior01 is the winner
        } else if (warrior01.getTotalForce() > warrior02.getTotalForce()) {

            if (warrior02.items.size() == 1) {
                warrior1Items.add(warrior02.items.get(0));
                System.out.println(warrior02.items.get(0)+"from warrior02 was moved to warrior01");
                warrior2Items.remove(warrior02.items.get(0));
            }
            if (warrior02.items.size() == 0) {
                System.out.println("No one item to move");
            } else{
                warrior1Items.add(warrior02.getHighestItem());
                System.out.println(warrior02.getHighestItem()+"from warrior02 was moved to warrior01");
                warrior2Items.remove(warrior02.getHighestItem());
            }
        //if it is draw
        } else if (warrior01.getTotalForce() == warrior02.getTotalForce()) {
            System.out.println("No one item was moved");
        }
        System.out.println(warrior01);
        System.out.println(warrior02);
    }
}
