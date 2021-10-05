public class Student {
    public static String name = "John";
    public static int studentNumber = 12345;

    public String getName(){
        return name;
    }
    public int getStudentNumber(){
        return studentNumber;
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println(student1.getName() + ": "+ student1.getStudentNumber());
    }
}
