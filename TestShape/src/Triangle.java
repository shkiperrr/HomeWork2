public class Triangle extends Shape {

    double a,b,c,p,s;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (a+b+c)/2;
        this.s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }



    @Override
    public double calculatePerimeter() {

        return p;
    }

    @Override
    public double calculateArea() {

        return s;
    }

    public void showInfo() {

        if ((a<b+c) && (b<a+c) && (c<a+b)) {

            System.out.println("Area : " + calculateArea());
            System.out.println("Perimeter : " + calculatePerimeter());
        }

        else System.out.println("Triangle with such sides does not exist!");
    }


}
