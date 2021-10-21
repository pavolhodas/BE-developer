public class Student {
    private String name;
    private int studentNumber;
    private int studentPhoneNumber;
    private String studentAddress;

    public int getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(int studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.setName("Sam");
        student01.setStudentNumber(1234);
        student01.setStudentPhoneNumber(+421589413);
        student01.setStudentAddress("Legionarska 1, 01001 Zilina");

        student02.setName("John");
        student02.setStudentNumber(55);
        student02.setStudentPhoneNumber(456789);
        student02.setStudentAddress("Legionarska 2, 01001 Zilina");

        System.out.println(student01.getName() + ": " + student01.getStudentNumber() + ", " + student01.getStudentPhoneNumber() + ", " + student01.getStudentAddress());
        System.out.println(student02.getName() + ": " + student02.getStudentNumber() + ", " + student02.getStudentPhoneNumber() + ", " + student02.getStudentAddress());
    }
}
