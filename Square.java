public class Square extends AbstractShape{
    private double height;

    public Square(String name, double height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.pow(height, 2.0);
    }
}
