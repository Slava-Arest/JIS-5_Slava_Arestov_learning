import java.util.Objects;

public class Parrot extends Bird{

    private boolean isTalking;

    public Parrot(String color, String type, boolean isFly, boolean isTalking) {
        super(color, type, isFly);
        this.isTalking = isTalking;
    }

    public void setTalking(boolean talking) {
        isTalking = talking;
    }

    public boolean isTalking() {
        return isTalking;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", isFly=" + isFly +
                ", isTalking=" + isTalking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parrot parrot = (Parrot) o;
        return isTalking() == parrot.isTalking();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isTalking());
    }
}
