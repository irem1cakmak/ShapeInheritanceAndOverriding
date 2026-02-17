public class Circle extends Shapes {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(String name, String colour, double radius) {
        super(name, colour);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Math.PI * (radius * radius);

    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +"Circle's radius: " +radius
                + " Circle's area: " + area + " Circle's perimeter: " + perimeter;
    }
}
