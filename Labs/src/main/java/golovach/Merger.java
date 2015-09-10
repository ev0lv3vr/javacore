package golovach;

import java.util.Arrays;

/**
 * Created by netchaev on 7/28/15.
 */
public class Merger {

    public static int[] merge(int[] fst, int[] snd) {

        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;

        while (fstIndex + sndIndex != result.length) {

            if (fst[fstIndex] > snd[sndIndex]) {
                result[fstIndex + sndIndex] = snd[sndIndex];
                if(sndIndex < (snd.length - 1)){
                    sndIndex++;
                }
                System.out.println("fst index : " + fst[fstIndex]);
                System.out.println("first: " + Arrays.toString(result));
            }

            if (fst[fstIndex] < snd[sndIndex]) {
                result[fstIndex + sndIndex] = fst[fstIndex];
                if(fstIndex < (fst.length - 1)){
                    fstIndex++;
                }
                System.out.println("snd index : " + snd[sndIndex]);
                System.out.println("second: " + Arrays.toString(result));
            }
            System.out.println("first index after: " + fstIndex + "--" + fst[fstIndex]);
            System.out.println("second index after: " + sndIndex + "--" + snd[sndIndex]);
        }
        return result;
    }


    public static void main(String[] args) {

        int[] arr1 = {1, 4, 6, 20, 22, 28, 29};
        int[] arr2 = {15, 17, 18};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }
}
