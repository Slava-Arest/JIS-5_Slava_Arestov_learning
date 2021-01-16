public class ArrayService {
    public int[] sort(int[] array){
        int i = 0;
        for (i = 0; i < array.length; i++){
            for (int j = i + 1; j < i; j++){
                int temp = array[j];
                array[j] = array[j + 1];
                array [j+1] = temp;
                }
        }
        return array;
    }
    public int[] swap(int[] array){
        int i = 0;
            int j = array.length -1;
            for (i = 0; i < j/2; i++){
                int temp = array[j-i];
                array[j-i] = array[i];
                array[i] = temp;
            }
        return array;
    }
    }

