public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getArea(Triangle triangle) {
        return sideA * sideB / 2;
    }

    public int getPerimeter(Triangle triangle) {
        return sideA + sideB + sideC;
    }

    public static void main(String[] args) {
        Triangle triangle01 = new Triangle(6, 4, 4);
        System.out.println(triangle01.getArea(triangle01));
        System.out.println(triangle01.getPerimeter(triangle01));
    }
}
