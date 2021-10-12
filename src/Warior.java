import java.util.Arrays;

public class Warior {
    private String name;
    private int life;
    private int speed;
    private int muscle;

    public Warior(String name, int life, int speed, int muscle) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
    }

    @Override
    public String toString() {
        return "Warior{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", speed=" + speed +
                ", muscle=" + muscle+
                '}';
    }

    public static void warOfWariors(){
        Warior warior01 = new Warior("Warior1", 9, 5, 7);

        Warior warior02 = new Warior("Warior2", 6, 9, 8);

        int totalForceWarior01 =warior01.life+ warior01.speed+warior01.muscle;
        int totalForceWarior02 = warior02.life+ warior02.speed+warior02.muscle;
        if(totalForceWarior01<totalForceWarior02){

        }
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watchs", 30);

        System.out.println(warior01+",  "+ items01);
        System.out.println(warior02+",  "+items02+",  "+items03);

    }
}
