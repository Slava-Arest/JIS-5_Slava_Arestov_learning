import java.util.Objects;

public class Bird extends Animals{

    protected boolean isFly;

    public Bird(String color, String type, boolean isFly) {
        super(color, type);
        this.isFly = isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isFly() {
        return isFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", isFly=" + isFly +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return isFly() == bird.isFly();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isFly());
    }
}
