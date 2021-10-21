import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    private String name;
    private String surname;
    JobPosition jobPosition;
    private Date date;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", jobPosition=" + jobPosition +
                ", date=" + date +
                '}';
    }

    public Employee(String name, String surname, JobPosition jobPosition, Date date) {
        this.name = name;
        this.surname = surname;
        this.jobPosition = jobPosition;
        this.date = date;
    }

    public static void getEmployee(Employee employee01) {


        System.out.println(employee01);
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf.parse("2018-03-28 00:00:00");

        JobPosition jobPosition = new JobPosition("IT programmer", 2100);
        Employee employee = new Employee("Jozko", "Mrkvicka", jobPosition, startDate);

        getEmployee(employee);
    }
}
