public class Circle extends Shape {

    private int r;
    final static double pi = 3.14;


    public Circle(int r){

        this.r = r;
    }

    @Override
    public double calculateArea() {

        return pi*r*r;
    }

    @Override
    public double calculatePerimeter() {

        return 2*pi*r;
    }

    public void showInfo() {

        System.out.println("Area : " + calculateArea());
        System.out.println("Perimeter : " + calculatePerimeter());
    }
}
