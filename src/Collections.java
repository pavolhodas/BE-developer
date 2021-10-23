import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Collections {

    List<Integer> referenceNumsInList = new ArrayList<>();
    public static int add(int a, int b) {
        Collections collections = new Collections();

        collections.referenceNumsInList.add(a);
        collections.referenceNumsInList.add(b);
        System.out.println(collections.referenceNumsInList);

        return a+b;
    }

    public static void getIntegers(List<Integer> integers) {
        List<Integer> numOfList = new ArrayList<>();

        integers.forEach((num) -> {
            numOfList.add(num);
        });
        if (numOfList.isEmpty()) System.out.println("List je prazdny");

        else System.out.println(numOfList);
    }

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder1 = Collections::add;
        System.out.println("Method Reference:");
        int result1 = adder1.apply(10, 20);
        int result2 = adder1.apply(10,5);
        int result3 = adder1.apply(4,8);

        System.out.println("Lambda function:");
        getIntegers(Arrays.asList(result1, result2, result3));
    }
}
