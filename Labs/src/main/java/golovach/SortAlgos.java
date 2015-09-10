package golovach;

import java.util.Arrays;

/**
 * Created by netchaev on 7/27/15.
 */
public class SortAlgos {

    public static int[] unsortedArr = {100, 4, 2, 15, 666, 355, 6, 34, 23, 11, 35, 8};
    public static int[] unsortedArr1 = {100, 4, 2, 15, 666, 355, 6, 1, 34, 23, 11, 35, 8};


    public static int [] smallestElement (int [] arr) {
        int minPosition = 0;
        int minElement = arr[0];
        for (int element = 1; element < arr.length; element++) {
            if ( arr[element] < minElement){
                minElement = arr[element];
                minPosition = element;
            }
        }
        int [] result = {minElement, minPosition};
        return result;
    }

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int minPosition = barrier + 1;
            int minElement = arr[minPosition];
            int tempBarrierValue = arr[barrier];

            for (int index = barrier + 2; index < arr.length; index++) {
                if(arr[index] < minElement){
                  minElement = arr[index];
                  minPosition = index;
                }
            }

            if(tempBarrierValue > minElement){
                arr[barrier] = minElement;
                arr[minPosition] = tempBarrierValue;
            }
        }
        System.out.println(Arrays.toString(unsortedArr));
    }


    public static void main(String[] args) {
        Long start = System.nanoTime();
        sort(unsortedArr);
        Long end = System.nanoTime();
        System.out.println((double)(end - start) / 1000000000.0 + " seconds");
        System.out.println(Arrays.toString(smallestElement(unsortedArr1)));
    }
}

