import java.util.ArrayList;
import java.util.stream.IntStream;

public class Person {
    private  String name;
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

    public static int getBudget(ArrayList<Person> person){
        ArrayList<Integer> budget = new ArrayList<>();

        int sum = 0;
        for(int i=0; i<person.size();i++){
            budget.add(person.get(i).budget);
            sum += budget.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        person.add(new Person("John", 21, 23000));
        person.add(new Person("Steve", 32, 40000));
        person.add(new Person("Martin", 16, 2700));

        System.out.println(getBudget(person));
    }
}
