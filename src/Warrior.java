import java.util.ArrayList;
import java.util.Arrays;

public class Warrior {
    private String name;
    private int life;
    private int speed;
    private int muscle;
    private ArrayList<Item> item;

    public Warrior(String name, int life, int speed, int muscle) {
        this.name = name;
        this.life = life;
        this.speed = speed;
        this.muscle = muscle;
        this.item = new ArrayList<Item>(2);
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

    public static void warOfWariors(Warrior warrior01, Warrior warrior02){




        //create items
        Item items01 = new Item("compass", 54);
        Item items02 = new Item("gold fish", 100);
        Item items03 = new Item("watches", 30);

        //calculate the force of warrior
        int totalForceWarrior01 = warrior01.life+ warrior01.speed+ warrior01.muscle;
        int totalForceWarrior02 = warrior02.life+ warrior02.speed+ warrior02.muscle;

        //add items to warriors
        warrior02.item.add(items02);

        warrior02.item.add(items01);
        warrior01.item.add(items03);

        //create a list which help to move items
        ArrayList<Item> removedItem = new ArrayList<Item>();

        //if warrior2 wins
        if(totalForceWarrior01 < totalForceWarrior02){
            if (warrior01.item.size() > 1) {
                System.out.println(warrior02.name + " is the winner");

                warrior01.life=warrior01.life-1;
                //if value of item(0) is bigger than value of item(1)
                if(warrior01.item.get(0).value>warrior01.item.get(1).value){
                    removedItem.add(warrior01.item.get(0));         //add the item to list of "removed item"
                    warrior01.item.remove(0);                   //remove the item from warrior who lost
                    warrior02.item.add(removedItem.get(0));           //add a removed item to warrior who win
                    System.out.println(removedItem.get(0) + " is moved to: "+warrior02.name);
                    removedItem.remove(0);                  //delete the item from list of "removed item"
                }

                //if value of item(1) is bigger than value of item(0)
                else if(warrior01.item.get(1).value>warrior01.item.get(0).value){
                    removedItem.add(warrior01.item.get(1));
                    warrior01.item.remove(1);
                    warrior02.item.add(removedItem.get(0));
                    System.out.println(removedItem.get(0) + " is moved to: "+warrior02.name);
                    removedItem.remove(0);
                }
            }
        }
        //if warrior2 wins && warrior1 have more items than one
        if (totalForceWarrior01 < totalForceWarrior02 && warrior01.item.size() > 1) {
            System.out.println(warrior02.name + " is the winner");

            warrior01.life=warrior01.life-1;
            //if value of item(0) is bigger than value of item(1)
            if(warrior01.item.get(0).value>warrior01.item.get(1).value){
                removedItem.add(warrior01.item.get(0));         //add the item to list of "removed item"
                warrior01.item.remove(0);                   //remove the item from warrior who lost
                warrior02.item.add(removedItem.get(0));           //add a removed item to warrior who win
                System.out.println(removedItem.get(0) + " is moved to: "+warrior02.name);
                removedItem.remove(0);                  //delete the item from list of "removed item"
            }

            //if value of item(1) is bigger than value of item(0)
            else if(warrior01.item.get(1).value>warrior01.item.get(0).value){
                removedItem.add(warrior01.item.get(1));
                warrior01.item.remove(1);
                warrior02.item.add(removedItem.get(0));
                System.out.println(removedItem.get(0) + " is moved to: "+warrior02.name);
                removedItem.remove(0);
            }
        }
        //if warrior1 wins && warrior2 have more items than one
        else if (totalForceWarrior01 > totalForceWarrior02 && warrior01.item.size() > 1) {
            System.out.println(warrior01.name + " is the winner");

            warrior02.life=warrior02.life-1;
            //if value of item(0) is bigger than value of item(1)
            if(warrior01.item.get(0).value>warrior01.item.get(1).value){
                removedItem.add(warrior01.item.get(0));         //add the item to list of "removed item"
                warrior01.item.remove(0);                   //remove the item from warrior who lost
                warrior02.item.add(removedItem.get(0));           //add a removed item to warrior who win
                System.out.println(removedItem.get(0) + " is moved to: "+warrior02.name);
                removedItem.remove(0);                  //delete the item from list
            }

            //if value of item(1) is bigger than value of item(0)
            else if(warrior01.item.get(1).value>warrior01.item.get(0).value){
                removedItem.add(warrior01.item.get(1));
                warrior01.item.remove(1);
                warrior02.item.add(removedItem.get(0));
                System.out.println(removedItem.get(0) + " is moved to: "+warrior02.name);
                removedItem.remove(0);
            }
        }
        //if warrior1 wins && warrior2 have only one item
        else if(totalForceWarrior01>totalForceWarrior02 && warrior01.item.size()==1){
            System.out.println(warrior01.name + " is the winner");
            warrior02.life=warrior02.life-1;
            removedItem.add(warrior02.item.get(0));         //add the item to list of "removed item"
            warrior02.item.remove(0);                   //remove the item from warrior who lost
            warrior01.item.add(removedItem.get(0));           //add a removed item to warrior who win
            System.out.println(removedItem.get(0) + " is moved to: "+warrior01.name);
            removedItem.remove(0);
        }
        //if warrior1 wins && warrior2 have only one item
        else if (totalForceWarrior01 > totalForceWarrior02 && warrior02.item.size() ==1) {
            System.out.println(warrior01.name + " is the winner");

            warrior02.life=warrior02.life-1;
            removedItem.add(warrior01.item.get(0));
            warrior02.item.remove(0);
            warrior01.item.add(removedItem.get(0));
            System.out.println(removedItem.get(0) + " is moved to: "+warrior01.name);
            removedItem.remove(0);
        }

        //if warrior2 wins && warrior1 have only one item
        else if (totalForceWarrior01 < totalForceWarrior02 && warrior01.item.size() == 1) {
            System.out.println(warrior02.name + " is the winner");
            warrior01.life=warrior01.life-1;
            removedItem.add(warrior01.item.get(0));
            warrior01.item.remove(0);
            warrior02.item.add(removedItem.get(0));
            System.out.println(removedItem.get(0) + " is moved to: "+warrior01.name);
            removedItem.remove(0);
        }
        //if warrior1 wins && warrior2 have no items
        else if(totalForceWarrior01 > totalForceWarrior02 && warrior02.item.size()==0){
            System.out.println(warrior01.name + " is the winner, but there is no items in: "+ warrior02.name);
            warrior02.life=warrior02.life-1;
        }
        //if warrior2 wins && warrior1 have no items
        else if(totalForceWarrior01 < totalForceWarrior02 && warrior01.item.size()==0){
            System.out.println(warrior02.name + " is the winner, but there is no items in: "+ warrior01.name);
            warrior01.life=warrior01.life-1;
        }
        //if warrior1 have some force as warrior2
        else if(totalForceWarrior01 == totalForceWarrior02){
            System.out.println("DRAW(no one item moved)");
        }
        System.out.println();
        System.out.println(warrior01);
        System.out.println(warrior02);
        System.out.println("warrior01 force: "+totalForceWarrior01);
        System.out.println("warrior02 force: "+totalForceWarrior02);
    }
    public static void main(String[] args) {
        //create two warriors
        Warrior warrior1 = new Warrior("Warrior1", 9, 5, 7 );
        Warrior warrior2 = new Warrior("Warrior2", 9, 9, 8);

        warOfWariors(warrior1, warrior2);
    }
}
