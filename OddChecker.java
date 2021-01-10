package Lecture_6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OddChecker {
    final Logger log = LoggerFactory.getLogger(OddChecker.class);

    public int ForOddChecker() {
        int i;
        for (i = 1; i <= 50; i+=2) {
            log.info("Number = {}", i);
        }
        return i;
    }

    public int DoWhileOddChecker() {
        int i = 1;
        do{
            log.info("Number = {}", i);
            i+=2;
        } while (i<=50);
        return i;
    }
    public int WhileOddChecker(){
        int i = 1;
        while (i<=50) {
            log.info("Number = {}", i);
            i += 2;
        }
        return i;
    }
}
