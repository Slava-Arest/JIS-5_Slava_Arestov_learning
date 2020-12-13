package Lecture_2;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int unboundRandom = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(15);
        System.out.println("unboundRandom = " + unboundRandom);
        int firstRandomNumber = new Random().nextInt(5000000);
        int secondRandomNumber = new Random().nextInt(3000000);
        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(firstRandomNumber + secondRandomNumber);
    }
}