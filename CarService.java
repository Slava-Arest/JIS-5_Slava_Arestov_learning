package Lecture_6;

public class CarService extends Car {
    Car car;

    public CarService(Car car) {
        this.car = car;
    }

    public int accelerate(int targetSpeed, Car car) {
        int speed = car.getCurrentSpeed();
        if (car.getCurrentSpeed() < targetSpeed) {
            for (speed = car.getCurrentSpeed(); speed < targetSpeed; speed++) {
            }
        }
        return speed;
    }

    public int decelerate(int targetSpeed, Car car) {
        int speed = car.getCurrentSpeed();
        if (car.getCurrentSpeed() > targetSpeed) {
            for (speed = car.getCurrentSpeed(); speed > targetSpeed; speed--);
        }
        return speed;
    }

    public boolean isDriving(Car car) {
        int speed = car.getCurrentSpeed();
        if (speed > 0) {
        }
        return true;
    }

    public boolean isStopped(Car car) {
        int speed = car.getCurrentSpeed();
        if (speed == 0) {
        }
        return true;
    }
    public boolean canAccelerate(Car car){
        int speed = car.getCurrentSpeed();
        int maxSpeed = car.getMaxSpeed();
        if (speed < maxSpeed){
        }
        return true;
    }
}