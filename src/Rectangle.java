public class Rectangle extends Shapes {
    private double longSide;
    private double shortSide;
    private double area;
    private double perimeter;

    public Rectangle(String name, String colour, double longSide, double shortSide) {
        super(name, colour);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (longSide + shortSide);
    }

    @Override
    public void calculateArea() {
        area = longSide * shortSide;

    }

    @Override
    public String toString() {
        return super.toString() +
                " Rectangle Long Side: " + longSide +
                " Rectangle Short Side: " + shortSide +
                " Rectangle Area: " + area +
                " Rectangle Perimeter: " + perimeter;
    }
}
