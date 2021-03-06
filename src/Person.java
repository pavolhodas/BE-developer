import java.util.ArrayList;
import java.util.stream.IntStream;

public class Person {
    private String name;
    private int age;
    private int budget;

    public Person(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", budget=" + budget +
                '}';
    }
    //6th exercise in collectins
    public static int getBudget(ArrayList<Person> person) {
        ArrayList<Integer> budget = new ArrayList<>();

        person.forEach(i -> budget.add(i.budget));
        Integer sum = budget.stream().reduce(0, Integer::sum);

        return sum;
    }

    //7th exercise in collectins
    public static boolean sortNamesByLetterA(ArrayList<Person> person) {
        ArrayList<Person> budget01 = new ArrayList<>();

        person.stream().filter(x -> x.name.contains("a")).forEach(budget01::add);

        return !budget01.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("John", 21, 23000));
        person.add(new Person("Steve", 32, 40000));
        person.add(new Person("Martin", 16, 2700));

        System.out.println(getBudget(person));
        System.out.println(sortNamesByLetterA(person));
    }
}
