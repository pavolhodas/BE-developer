public class Triangle {
    private static int sideA;
    private static int sideB;
    private static int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static int getArea(Triangle triangle){
        return sideA*sideB/2;
    }

    public static int getPerimeter(Triangle triangle){
        return sideA+sideB+sideC;
    }
    public static void main(String[] args) {
        Triangle triangle01 = new Triangle(6,4,4);
        System.out.println(getArea(triangle01));
        System.out.println(getPerimeter(triangle01));
    }
}
