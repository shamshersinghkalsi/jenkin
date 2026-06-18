package June09;

public class Students {
    String name;
    int rollNo;

    public Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "{ name='" + name  +
                ", rollNo=" + rollNo +
                '}';
    }
}
