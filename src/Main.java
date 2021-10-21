import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create items
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watches", 30);

        //create list of items
        ArrayList<Item> warrior1Items = new ArrayList<Item>(){};
        warrior1Items.add(items03);

        ArrayList<Item> warrior2Items = new ArrayList<Item>(){};
        warrior2Items.add(items02);
        warrior2Items.add(items01);

        //create two warriors
        Warrior warrior01 = new Warrior("Warrior1", 9, 5, 7, warrior1Items);
        Warrior warrior02 = new Warrior("Warrior2", 9, 9, 8, warrior2Items);

        Warrior.warOfWariors(warrior01, warrior1Items, warrior02, warrior2Items);

    }
}
