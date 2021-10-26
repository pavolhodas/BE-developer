import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void getIntegersLambada(List<Integer> integers) {


        integers.forEach(i -> System.out.println(i));
        if (integers.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(integers);
    }

    public static void getIntegersReference(List<Integer> integers) {

        integers.forEach(System.out::println);
        if (integers.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(integers);
    }

    private static void addIfNotExists(List<Integer> integers, int newItem){
        List<Integer> listOfNums = new ArrayList<>();

        integers.forEach(listOfNums::add);
        if (integers.contains(newItem)) System.out.println("new item already exist in this list");

        else {
            listOfNums.add(newItem);
            System.out.println(listOfNums);
        }
    }
    public static void main(String[] args) {

        System.out.println("Lambda function:");
        getIntegersLambada(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Method reference:");
        getIntegersReference(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ));

        System.out.println("Add integer to list:");
        addIfNotExists(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5 ), 9);
    }
}
