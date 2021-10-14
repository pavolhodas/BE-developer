import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private List<Item> item;

    public Warrior(String name, int life, int speed, int muscle) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.item = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", speed=" + speed +
                ", muscle=" + muscle +
                ", item=" +Arrays.toString(item.toArray())+
                '}';
    }

    public static void warOfWariors() {
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watches", 30);

        Warrior warrior01 = new Warrior("Warrior1", 9, 5, 7);
        Warrior warrior02 = new Warrior("Warrior2", 1, 9, 8);

        int totalForceWarrior01 = warrior01.life + warrior01.speed + warrior01.muscle;
        int totalForceWarrior02 = warrior02.life + warrior02.speed + warrior02.muscle;

        warrior01.item.add(items01);
        warrior01.item.add(items02);
        warrior02.item.add(items03);

        if (totalForceWarrior01 < totalForceWarrior02 && warrior01.item.size() > 0) {
                warrior01.item.remove(0);
                warrior02.item.add(items02);
                System.out.println(warrior02.name + " is the winner");

        }
        else if(totalForceWarrior02 < totalForceWarrior01 && warrior02.item.size() > 0){
            warrior02.item.remove(0);
            warrior01.item.add(items02);
            System.out.println(warrior01.name + " is the winner");
        }

        System.out.println("warrior01: "+totalForceWarrior01);
        System.out.println("warrior02: "+totalForceWarrior02);
        System.out.println(warrior01);
        System.out.println(warrior02);
    }

    public static void main(String[] args) {
        warOfWariors();
    }
}
