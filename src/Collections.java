import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    //1. exercise
    public static void getIntegersLambada(List<Integer> integers) {


        integers.forEach(i -> System.out.println(i));
        if (integers.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(integers);
    }
    //1. exercise
    public static void getIntegersReference(List<Integer> integers) {

        integers.forEach(System.out::println);
        if (integers.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(integers);
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
    }
}
