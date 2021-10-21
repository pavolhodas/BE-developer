public class JobPosition {
    private String name;
    private double salary;

    public JobPosition(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
