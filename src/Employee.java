public class Employee {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Employee(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public static void getEmployee(){
    Date dateOfBirth = new Date("4.7.1990");
    JobPosition jobPosition = new JobPosition("IT programmer", 2100);
    Employee employee01 = new Employee("Jozko", "Mrkvicka");

    System.out.println(employee01 +", " +jobPosition +", " + dateOfBirth );
}

}
