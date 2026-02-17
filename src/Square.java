public class Square extends Rectangle{
    private double side;
    private double area;
    private double perimeter;

    public Square(String name, String colour, double side) {
        super(name, colour,side,side);
        this.side = side;
    }

    @Override
    public void calculatePerimeter() {
       perimeter=4*side;
    }

    @Override
    public void calculateArea() {
      area=side*side;
    }

    @Override
    public String toString() {
        return  "Shape Name: "+super.name.toString() +
                " And Shape Colour: " + super.colour.toString()+
                " Square Side: " + side +
                " Square Area: " + area +
                " Square Perimeter: " + perimeter;
    }
}
