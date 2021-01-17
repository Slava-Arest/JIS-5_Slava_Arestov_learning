import java.util.Objects;

public class Cat extends Mammal{
    private boolean meow;

    public Cat(String color, String type, boolean drinksMilk, boolean meow) {
        super(color, type, drinksMilk);
        this.meow = meow;
    }

    public void setMeow(boolean meow) {
        this.meow = meow;
    }

    public boolean isMeow() {
        return meow;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", meow=" + meow +
                ", drinksMilk=" + drinksMilk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return isMeow() == cat.isMeow();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isMeow());
    }
}
