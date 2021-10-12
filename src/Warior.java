import java.util.Arrays;

public class Warior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    Item[] items = new Item[]{};

    @Override
    public String toString() {
        return "Warior{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", speed=" + speed +
                ", muscle=" + muscle +
                ", items=" + Arrays.toString(items) +
                '}';
    }

    public static void warOfWariors(){
        Warior warior01 = new Warior();
        warior01.name="Warior1";
        warior01.life=9;
        warior01.speed=5;
        warior01.muscle=7;

        Warior warior02 = new Warior();
        warior02.name="Warior2";
        warior02.life=6;
        warior02.speed=9;
        warior02.muscle=8;

        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watchs", 30);

        System.out.println(warior01.name +",  "+ warior01.life+",  "+ warior01.speed+",  "+warior01.muscle+",  "+ items01);
        System.out.println(warior02.name +",  "+ warior02.life+",  "+ warior02.speed+",  "+warior02.muscle+",  "+items02.name+",  "+items02.value+",  "+items03.name+",  "+items03.value);
    }
}
