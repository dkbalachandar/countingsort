import java.util.Arrays;

public class CountingSort {

    public static int[] countingSort(int[] src, int totNum) {

        int c[] = new int[totNum];
        //Fill the count array
        for (int i = 0; i < src.length; i++)
            c[src[i]]++;
        //Then sum up with previous array element
        for (int i = 1; i < totNum; i++)
            c[i] += c[i - 1];
        //Initialize the output array
        int output[] = new int[src.length];
        for (int i = src.length - 1; i >= 0; i--)
            output[--c[src[i]]] = src[i];
        return output;
    }

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 8, 9};
        System.out.println("Before Counting Sort. Data array is " + Arrays.toString(array));
        array = countingSort(array, 11);
        System.out.println("After Counting Sort. Data array is " + Arrays.toString(array));
    }
}

