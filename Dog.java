import java.util.Objects;

public class Dog extends Mammal {
    private boolean voice;

    public Dog(String color, String type, boolean drinksMilk, boolean voice) {
        super(color, type, drinksMilk);
        this.voice = voice;
    }

    public void setVoice(boolean voice) {
        this.voice = voice;
    }

    public boolean isVoice() {
        return voice;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", voice=" + voice +
                ", drinksMilk=" + drinksMilk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return isVoice() == dog.isVoice();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isVoice());
    }
}