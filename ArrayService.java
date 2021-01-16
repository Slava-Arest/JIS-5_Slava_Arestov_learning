import java.util.Random;

public class ArrayService {

    public int[] create (int size){
        return new int[size];
    }
    public int[] fillRandomly(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }
        return massive;
    }
    public void printArray(int[] array){
        for (int i = 0; i < array.length; i++);
    }
    public int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
   public double avg(int[] array){
        double average = 0;
        if (array.length > 0){
            average = sum(array) / array.length;
        }
        return average;
    }
}
