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
        Student[] student = new Student[3];

        Student student1 = new Student("Palo", 17, 23000 );
        Student student2 = new Student("Steve", 32, 40000 );
        Student student3 = new Student("Martin", 16, 2700 );

        student[0]=student1;
        student[1]=student2;
        student[2]=student3;

        System.out.println("name: "+ student1.Name +", age: "+  student1.Years + ", budget: "+ student1.Budget);
        System.out.println("name: "+student2.Name +", age: "+ student2.Years + ", budget: "+student2.Budget);
        System.out.println("name: "+student3.Name +", age: "+ student3.Years + ", budget: "+student3.Budget);
        System.out.println(student[0].Budget + student[1].Budget +student[2].Budget);
    }

    public static void main(String[] args) {
     getStudent();
    }
}
