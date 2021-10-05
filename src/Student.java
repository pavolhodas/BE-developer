public class Student {
    String Name;
    int Years;
    int Budget;



    public Student(String name, int years, int budget){
        Name= name;
        Years=years;
        Budget=budget;
    }
    public static void getStudent(){
        int[] budgetArray = new int[3];

        Student student1 = new Student("Palo", 17, 23000 );
        Student student2 = new Student("Steve", 32, 40000 );
        Student student3 = new Student("Martin", 16, 2700 );

        budgetArray[0]=student1.Budget;
        budgetArray[1]=student2.Budget;
        budgetArray[2]=student3.Budget;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(budgetArray[0]+budgetArray[1]+budgetArray[2]);
    }

    public static void main(String[] args) {

    }
}
