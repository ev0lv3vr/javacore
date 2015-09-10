package golovach;

import java.util.Arrays;

/**
 * Created by netchaev on 7/7/15.
 */
public class Inverter_optimized {
    public static void main(String[] args) {
        int [] arr = {10, 5, 6 , 2, 10, 20, 1, 33};
        for (int i = 0; i < arr.length / 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }
        System.out.println(Arrays.toString(arr));

        //

        //out of place inverted array when preserving source

        //

        System.out.println("2 arrays, 1 inverted");

        int [] sourceArr = {1, 2, 3, 4, 5, 6};
        int [] invertedArr = new int[sourceArr.length];
        int j = invertedArr.length - 1;

        for (int i = 0; i < sourceArr.length; i++) {
                invertedArr[j] = sourceArr[i];
                j--;
            }



        System.out.println(Arrays.toString(sourceArr));
        System.out.println(Arrays.toString(invertedArr));
    }
}
