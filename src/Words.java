public class Words {
    public String Name;

    public Words(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return Name + '\'';
    }
}
