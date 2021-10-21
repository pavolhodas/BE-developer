import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create items
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watches", 30);

        //create two warriors
        Warrior warrior1 = new Warrior("Warrior1", 9, 5, 7, Arrays.asList(items01, items03, items02));
        Warrior warrior2 = new Warrior("Warrior2", 9, 9, 8, Arrays.asList(items01, items03, items02));

        Warrior.warrior01.warOfWariors(warrior1, warrior2);
    }
}
