public class Student {
    private String name;
    private int studentNumber;

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
        student01.setName("Jozo");
        student01.setStudentNumber(1234);
        System.out.println(student01.getName()+": "+ student01.getStudentNumber());
    }
}
