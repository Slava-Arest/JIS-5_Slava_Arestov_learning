package Lecture_6;

public class NumberService {
    public int rangeSum(int start, int finish) {

        int sum = 0;

        if (start>=finish){
            for (int i = start; i>=finish; i--){
                sum += i;
            }
        }
        else {
            for (int i = start; i<=finish; i++){
                sum += i;
            }
        }
        return sum;
    }
    public int rangeEvenCount(int start, int finish){

        int sum2 = 0;

        if (start>=finish){
            for (int ii = start; ii>=finish; ii--){
                if (ii % 2 == 0) sum2++;
            }
        }
        else {
            for (int ii = start; ii<=finish; ii++){
                if (ii % 2 == 0) sum2++;
            }
        }
        return sum2;
    }
}
