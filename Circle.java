public class Circle extends AbstractShape {
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.pow(radius, 2.0);
    }
}
