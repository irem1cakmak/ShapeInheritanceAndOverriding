public class Shapes {

    protected String name;
    protected String colour;

    public Shapes(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public void calculateArea() {

    }

    public void calculatePerimeter() {

    }

    @Override
    public String toString() {
        return "Shape Name: " + name + " And Shape Colour: " + colour;
    }
}