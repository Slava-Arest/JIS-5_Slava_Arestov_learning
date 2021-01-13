package Lecture_6;

import java.util.Objects;

public class Car {
    String model;
    String color;
    int maxSpeed;
    int currentSpeed;

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && currentSpeed == car.currentSpeed && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }
}