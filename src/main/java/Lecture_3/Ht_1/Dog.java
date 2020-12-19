package Lecture_3.Ht_1;

import java.util.Objects;

public class Dog {

    int age;
    String color;
    String name;

    public Dog(int age, String color, String name) {
    }

    public Dog(String name) {
this.name = name;
    }

    public Dog() {

    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
public String toString() {

    return "Dog{" +
            "age=3, " +
            "color='White', " +
            "name='Pluto'}";

}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return (age == dog.age) &&
                (color == dog.color) &&
                (name == dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name);
    }

}

