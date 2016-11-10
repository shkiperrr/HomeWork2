import java.util.Scanner;

public class TestShape {

    public static void main(String[] args){


        Scanner scanner;
        String str = "";

        while (!str.equals("END")){
            System.out.println("Input shape (CIRCLE, SQUARE, TRIANGLE, RECTANGLE) : ");

            scanner = new Scanner(System.in);
            str = scanner.nextLine();

            switch (ShapesEnum.valueOf(str)) {
                case CIRCLE:
                    System.out.println("Input r : ");
                    int r = scanner.nextInt();
                    Circle circle = new Circle(r);
                    System.out.println("Circle info : ");
                    circle.showInfo();
                    break;
                case SQUARE:
                    System.out.println("Input a : ");
                    int q = scanner.nextInt();
                    Square square = new Square(q);
                    System.out.println("Square info : ");
                    square.showInfo();
                    break;
                case TRIANGLE:
                    System.out.println("Input a : ");
                    double a = scanner.nextInt();
                    System.out.println("Input b : ");
                    double b = scanner.nextInt();
                    System.out.println("Input c : ");
                    double c = scanner.nextInt();
                    Triangle triangle = new Triangle(a,b,c);
                    System.out.println("Triangle info : ");
                    triangle.showInfo();
                    break;
                case RECTANGLE:
                    System.out.println("Input a : ");
                    int x = scanner.nextInt();
                    System.out.println("Input b : ");
                    int y = scanner.nextInt();
                    Rectangle rectangle = new Rectangle(x,y);
                    System.out.println("Rectangle info : ");
                    rectangle.showInfo();
                    break;
                case END:
                    break;
            }

        }
            

    }
}
