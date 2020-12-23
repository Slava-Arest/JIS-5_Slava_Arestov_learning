package Lecture_4;

public class SignComparator {
    public String compare(int number) {
        if (number>0){
            return "Number is positive";
        }
        else if (number<0){
            return "Number is negative";
        }
        else if(number == 0){
            return "Number is equals zero";
        }
        return null;
    }

}
