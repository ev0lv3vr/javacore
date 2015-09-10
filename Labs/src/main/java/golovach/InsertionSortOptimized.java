package golovach;

import java.util.Arrays;

/**
 * Created by netchaev on 8/2/15.
 *
 * реализована не оптимально, так как внутренний цикл while
 - ищет позицию для вставки, перебирая последовательно элементы, при этом он
 - поэлементно "смещает" массив.
 В целях оптимизации перепишите алгоритм:
 1. Ищите позицию для вставки элемента бинарным поиском (Arrays.binarySearch(...)).
 2. Найдя позицию - смещайте всю часть массива за один вызов (System.arraycopy(...)).
 В моих экспериментах эти две оптимизации ускорили сортировку в 2.2-2.6 раза.
 */
public class InsertionSortOptimized {

    private static int [] arr =  {100, 4, 2, 15, 666, 355, 6, 34, 23, 11, 35, 8};
    private static int [] arr1 =  {0};

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            if (arr[location] > newElement){
                int newLocation = Arrays.binarySearch(arr,0,k,newElement);
                newLocation = -(newLocation + 1);
                System.arraycopy(arr, newLocation, arr, newLocation + 1, k - newLocation );
                arr[newLocation] = newElement;
            }
        }
        System.out.println("*****************************");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
}
