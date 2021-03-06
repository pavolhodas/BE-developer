import java.util.*;

public class Collections {
    //1. exercise
    public static void getIntegersLambada(List<Integer> integers) {
        List<Integer> listOfNums = new ArrayList<>();

        integers.forEach(i -> listOfNums.add(i));
        if (integers.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(listOfNums);
    }
    //1. exercise
    public static void getIntegersReference(List<Integer> integers) {
        List<Integer> listOfNums = new ArrayList<>();

        integers.forEach(listOfNums::add);
        if (integers.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(listOfNums);
    }
    //2. exercise
    private static void addIfNotExists(List<Integer> integers, int newItem){
        List<Integer> listOfNums = new ArrayList<>();

        integers.forEach(listOfNums::add);
        if (integers.contains(newItem)) System.out.println("new item already exist in this list");

        else {
            listOfNums.add(newItem);
            System.out.println(listOfNums);
        }
    }
    //3. exercise
    public static void clearIfOdd(List<Integer> integers){
        List<Integer> listOfNums = new ArrayList<>();
        integers.forEach(listOfNums::add);

        integers.stream().filter(i -> i % 2 == 0).forEach(listOfNums::remove);
        System.out.println(listOfNums);
    }
    //4. exercise
    public static void addIfOdd(List<Integer> integers){
        List<Integer> listOfNums = new ArrayList<>();

        integers.stream().filter(i -> i % 2 == 0).forEach(listOfNums::add);
        System.out.println(listOfNums);
    }

    //5. exercise
    public static void multiplyByLength(List<Integer> integers){
        List<Integer> listOfNums = new ArrayList<>();

        integers.stream().map(i-> i* integers.size()).forEach(listOfNums::add);
        System.out.println(listOfNums);
    }

    //8th exercise
    public static void firstTimeHashSet(Set<Integer> integerSet){
        Set<Integer> integerSetForAdding = new HashSet<>();

        integerSet.forEach(integerSetForAdding::add);
        System.out.println(integerSetForAdding);
    }

    //9th exercise
    public static void firstTimeHashMap(Map<String, Integer> item01){

        item01.put("Red", 1);
        item01.put("Green", 2);
        item01.put("Black", 3);
        item01.put("White", 4);
        System.out.println(item01);
    }

    //10th exercise
    Map<String, Integer> alreadyPutedItems = new HashMap<>();

    public void putElement(String key, int value){
        Map<String, Integer> newItem = new HashMap<>();

        alreadyPutedItems.forEach(newItem::put);
        alreadyPutedItems.keySet().stream().filter(i -> !key.matches(i)).forEach(i -> newItem.put(key, value));

        System.out.println(newItem);
    }


    public static void main(String[] args) {

        System.out.println("Lambda function:");
        getIntegersLambada(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Method reference:");
        getIntegersReference(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Add integer to list:");
        addIfNotExists(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ), 9);

        System.out.println("Clear if it is odd:");
        clearIfOdd(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Add if it is odd:");
        addIfOdd(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Multiply by length:");
        multiplyByLength(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Using hashset list:");
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(5);                              //Rozdiely: elementy su cislovane od 1, v Liste od 0
        integerSet.add(3);                              //          nemozeme pridat dvakrat ten isty element
        integerSet.add(4);                              //          elementy sa vypisuju porade(abecedne, alebo od najmensieho po najvacsi)
        integerSet.add(2);
        integerSet.add(1);
        integerSet.remove(5);
        firstTimeHashSet(integerSet);

        System.out.println("Using HashMap:");
        Map<String, Integer> item01 = new HashMap<>();
        firstTimeHashMap(item01);

        Collections collections = new Collections();
        System.out.println("Putting elements to HashMap:");
        collections.alreadyPutedItems.put("Adam", 4);
        collections.alreadyPutedItems.put("Fero", 5);
        collections.putElement("roman", 6);
    }
}
