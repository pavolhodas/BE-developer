import java.util.Arrays;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private static Item item;

    public Warrior(String name, int life, int speed, int muscle, Item item) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", speed=" + speed +
                ", muscle=" + muscle +
                ", item=" + item +
                '}';
    }

    public static void warOfWariors(){
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watches", 30);

        Warrior warrior01 = new Warrior("Warrior1", 9, 5, 7, item);
        Warrior warrior02 = new Warrior("Warrior2", 6, 9, 8, item);

        int totalForceWarior01 = warrior01.life+ warrior01.speed+ warrior01.muscle;
        int totalForceWarior02 = warrior02.life+ warrior02.speed+ warrior02.muscle;

        Item item[]=new Item[3];
        item[0]=items01;
        item[1]=items02;
        item[2]=items03;

        if(totalForceWarior01<totalForceWarior02){
            System.out.println(warrior01.name+" is the winner");
            if(warrior02.item!=null){
                warrior02.item=null;
                System.out.println(warrior01.name+" is the winner");
            }
        }

        System.out.println(warrior01 +",  "+ items01);
        System.out.println(warrior02 +",  "+items02+",  "+items03);
        System.out.println(Arrays.toString(item));
    }
    public static void main(String[] args) {
    warOfWariors();
    }
}
