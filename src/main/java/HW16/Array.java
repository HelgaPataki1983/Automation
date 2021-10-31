package HW16;

import java.util.Scanner;

public class Array {
    public float averOfArray(int[] array) {
        int sum = 0;
        float result = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];


        }
        result = sum / array.length;
        return result;
    }
}


