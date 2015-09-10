package golovach;

import java.util.Arrays;

/**
 * Created by netchaev on 7/8/15.
 */
public class SimplePrimitives {



    static int [] oneDimention = new int [] {1,2,3,};
    static int [][] twoDimention = new int[][] {{1,2},{3,4}};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(oneDimention));
        System.out.println(Arrays.deepToString(twoDimention));
    }
}
