import java.util.ArrayList;

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

    public static void warOfWariors(Warrior warrior01 , Warrior warrior02) {

        //if warrior02 is the winner
        if (warrior01.getTotalForce() < warrior02.getTotalForce()) {

            if (warrior01.items.size() == 1) {
                warrior02.items.add(warrior01.items.get(0));
                System.out.println(warrior01.items.get(0)+"from warrior01 was moved to warrior02");
                warrior01.items.remove(warrior01.items.get(0));

            } else if (warrior01.items.size() == 0) {
                System.out.println("No one item to move");
            } else {
                warrior02.items.add(warrior01.getHighestItem());
                System.out.println(warrior01.getHighestItem()+"from warrior01 was moved to warrior02");
                warrior01.items.remove(warrior01.getHighestItem());
            }
        //if warrior01 is the winner
        } else if (warrior01.getTotalForce() > warrior02.getTotalForce()) {

            if (warrior02.items.size() == 1) {
                warrior01.items.add(warrior02.items.get(0));
                System.out.println(warrior02.items.get(0)+"from warrior02 was moved to warrior01");
                warrior02.items.remove(warrior02.items.get(0));
            }
            if (warrior02.items.size() == 0) {
                System.out.println("No one item to move");
            } else{
                warrior01.items.add(warrior02.getHighestItem());
                System.out.println(warrior02.getHighestItem()+"from warrior02 was moved to warrior01");
                warrior02.items.remove(warrior02.getHighestItem());
            }
        //if it is draw
        } else if (warrior01.getTotalForce() == warrior02.getTotalForce()) {
            System.out.println("No one item was moved");
        }
        System.out.println(warrior01);
        System.out.println(warrior02);
    }
    public static void main(String[] args) {

        //create list of items
        ArrayList<Item> warrior1Items = new ArrayList<Item>(){};
        warrior1Items.add(new Item("watches", 30));

        ArrayList<Item> warrior2Items = new ArrayList<Item>(){};
        warrior2Items.add(new Item("compass", 54));
        warrior2Items.add(new Item("gold fish", 100));

        //create two warriors
        Warrior warrior01 = new Warrior("Warrior1", 9, 5, 7, warrior1Items);
        Warrior warrior02 = new Warrior("Warrior2", 9, 9, 8, warrior2Items);

        Warrior.warOfWariors(warrior01, warrior02);

    }
}
