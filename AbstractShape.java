public abstract class AbstractShape implements Shape{

    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }
    public abstract double calculateArea();
}
