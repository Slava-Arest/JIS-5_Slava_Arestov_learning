import java.util.Objects;

public class Animals {
    protected String color;
    protected String type;

    public Animals(String color, String type){
        this.color = color;
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(getColor(), animals.getColor()) && Objects.equals(getType(), animals.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getType());
    }
}
