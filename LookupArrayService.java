package Lecture_7;

public class LookupArrayService {

     public int findMax(int[] array) {
        int max = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) max = Math.max(max, array[i]);
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = 10;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) min = Math.min(min, array[i]);
        }
        return min;
    }

    public int indexOfMax(int[] array) {
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[idx] < array[i]) {
                idx = i;
            }
        }
        return idx;
    }

    public int indexOfMin(int[] array) {
        int idx = 0;
        for (int i = 0; i > array.length; i--) {
            if (array[idx] > array[i]) {
                idx = i;
            }
        }
        return idx;
    }



    public int indexOfNumber(int[] array, int value) {
        int idx = -1;
        if(array.length>0) {
            for (int i = 0; i < array.length; i++){
                if(array[i]==value) idx = i;
            }
        }
        return idx;
    }
    }
}
