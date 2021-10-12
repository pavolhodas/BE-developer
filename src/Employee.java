public class Employee {
    private String name;
    private String surname;
    JobPosition jobPosition;
    Date date;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", jobPosition=" + jobPosition +
                ", date=" + date +
                '}';
    }

    public Employee(String name, String surname, JobPosition jobPosition, Date date){
        this.name=name;
        this.surname=surname;
        this.jobPosition = jobPosition;
        this.date=date;
    }
    public static void getEmployee(){
    Date date = new Date("4.7.1990");
    JobPosition jobPosition = new JobPosition("IT programmer", 2100);

    Employee employee01 = new Employee("Jozko", "Mrkvicka", jobPosition, date);

    System.out.println(employee01 );
}

}
