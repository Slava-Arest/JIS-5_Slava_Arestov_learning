import java.util.Objects;

public class Mammal extends Animals{

    protected boolean drinksMilk;

    public Mammal(String color, String type, boolean drinksMilk) {
        super(color, type);
        this.drinksMilk = drinksMilk;
    }

    public void setDrinksMilk(boolean drinksMilk) {
        this.drinksMilk = drinksMilk;
    }

    public boolean isDrinksMilk() {
        return drinksMilk;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", drinksMilk=" + drinksMilk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return isDrinksMilk() == mammal.isDrinksMilk();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isDrinksMilk());
    }
}
