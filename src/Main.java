public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.StudentNumber = 4;
        student1.Name = "John";
        student1.StudentPhoneNumber = +421908625;
        student1.StudentAdress = "01313 Rajecke teplice";

        System.out.println(student1.getName() + ", "+ student1.getStudentNumber()+", "+student1.getPhoneNumber() +", "+ student1.getStudentAdress());

        Student student2 = new Student();
        student2.StudentNumber = 9;
        student2.Name = "Sam";
        student2.StudentPhoneNumber = +421111225;
        student2.StudentAdress ="01001 Zilina";

        System.out.println(student2.getName() + ", "+ student2.getStudentNumber()+", "+student2.getPhoneNumber() +", "+ student2.getStudentAdress());
    }
}
