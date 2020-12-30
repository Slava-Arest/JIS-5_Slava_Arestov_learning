package Lecture_5;

public class Counter {
    public int value;
    public int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public int increment() {
        if(value <= 100) value += step;
        return value;
        //TODO
    }
    public int decrement() {
        if (value >= 0) value -= step;
        return value;
        //TODO
    }

    public int clear() {
        if (value == 0){
            return value;
        }
        return 0;
    }

    public void setValue(int value) {
        this.value = value;
        //TODO
    }
    public int getValue() {
        return value;
        //TODO
    }

    public void setStep(int step) {
        this.step = step;
        //TODO
    }

    public int getStep() {
        return step;
        //TODO
    }
}
