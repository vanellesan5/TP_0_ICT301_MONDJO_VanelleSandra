package OCP.avant;

public class Main {
    public static void Main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        System.out.println("Aire du rectangle" +calculator.calculateArea(rectangle));
        System.out.println("Aire du cercle :"+ calculator.calculateArea(circle));

    }
}
