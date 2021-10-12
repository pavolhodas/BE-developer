public class Date {
    private String date;

    @Override
    public String toString() {
        return "Date{" +
                "date='" + date + '\'' +
                '}';
    }

    public Date(String date){
        this.date=date;
    }
}
