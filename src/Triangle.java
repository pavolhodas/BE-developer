public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;
    public Triangle(int a, int b, int c){
        sideA=a;
        sideB=b;
        sideC=c;
    }

    public static int getArea(){
        Triangle triangle01=new Triangle(4,5,7);
        return triangle01.sideA +triangle01.sideB+triangle01.sideC;
    }
    public static int getPerimeter(){
        Triangle triangle01=new Triangle(4,5,7);
        return (int) (0.5*triangle01.sideA*triangle01.sideB);
    }
}
