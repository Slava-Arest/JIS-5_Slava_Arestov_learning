package Lecture_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrimeNumbers {

    public static void main(){
        final Logger log = LoggerFactory.getLogger(PrimeNumbers.class);
        int numbersCount = 0;
        int sumOfNumbers = 0;
        for (int i = 2; i <= 500; i++){
            if (numbersCount == 50) break;
            if (numbersCount == 17) continue;
            if (numbersCount == 71) continue;


            int b = 0;

            for (int c = 2; c <= i; c++){
                if ((i % c) == 0) b++;
            }
            if (b == 1) {
                numbersCount++;
                sumOfNumbers =+ i;
            }
        }
        log.info("numbersCount = {}", numbersCount);
        log.info("sumOfNumbers = {}", sumOfNumbers);
        }
    }

