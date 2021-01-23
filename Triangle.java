public class Triangle extends AbstractShape{
    private double height;
    private double base;

    public Triangle(String name, double height, double base) {
        this.name = name;
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
