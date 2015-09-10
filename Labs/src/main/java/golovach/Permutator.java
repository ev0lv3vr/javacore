package golovach;

import java.util.Arrays;
import java.util.List;

/**
 * Created by netchaev on 8/18/15.
 */
public class Permutator {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        permutation(arr, arr.length);
        System.out.println();
    }
    private static void permutation(int[] arr, int size) {
        if (size < 2) {
            System.out.println(Arrays.toString(arr));
        } else {

            for (int k = 0; k < size; k++) {
                System.out.println("Tests array mutation: " + Arrays.toString(arr) + " With size = " + size + " and K = " + k);
                swap(arr, k, arr.length - 1);
                permutation(arr, size - 1);
            }
        }
    }
    private static void swap(int[] arr, int index0, int index1) {
        System.out.println("swapping the first and last element " + arr[index0] + " * " + arr[index1]);
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
