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

    public static int getBudgetOfPerson(){

        Person person01 = new Person("John", 21, 23000);
        Person person02 = new Person("Steve", 32, 40000);
        Person person03 = new Person("Martin", 16, 2700);

        Person person[]=new Person[3];
        person[0]= person01;
        person[1]= person02;
        person[2]= person03;

        System.out.println(person[0]+", "+person[1]+", "+person[2]);
        return person[0].budget+person[1].budget+person[2].budget;
    }

    public static void main(String[] args) {
        System.out.println("Person budget together: "+getBudgetOfPerson());
    }
}
