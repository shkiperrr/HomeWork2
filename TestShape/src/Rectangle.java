public class Rectangle extends Shape {

    private int a; int b;
    private Triangle triangle;



    public Rectangle(int a, int b) {

        this.a = a;
        this.b = b;

        triangle = new Triangle(a,b, Math.sqrt(a*a+b*b));
    }

    @Override
    public double calculateArea() {

        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(a+b);
    }


    public void showInfo() {

        System.out.println("Area : " + calculateArea());
        System.out.println("Perimeter : " + calculatePerimeter());

        System.out.println("Triangle info : ");
        triangle.showInfo();
    }
}
