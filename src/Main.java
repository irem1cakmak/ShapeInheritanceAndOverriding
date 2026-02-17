//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", "Green", 5);
        circle.calculateArea();
        circle.calculatePerimeter();
        System.out.println(circle);
        Rectangle rectangle=new Rectangle("Rectangle","brown",7,5.5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle);
        Square square=new Square("Square","Orange",6.5);
        square.calculateArea();
        square.calculatePerimeter();
        System.out.println(square);

    }
}