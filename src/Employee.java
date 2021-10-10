public class Employee {
    String name;
    String surname;
    Date dateOfBirth = new Date();
    JobPosition jobPosition = new JobPosition();

public static void getEmployee(){
    Employee employee01 = new Employee();

    employee01.name="Jozko";
    employee01.surname="Mrkvicka";
    employee01.dateOfBirth.Date="nar. 4.7.1990";
    employee01.jobPosition.name="IT programmer";
    employee01.jobPosition.salary=2100;

    System.out.println(employee01.name +  " "+employee01.surname +", " +employee01.dateOfBirth.Date +", " + employee01.jobPosition.name +", salary: " + employee01.jobPosition.salary);
}

}
