package golovach;

import java.util.DoubleSummaryStatistics;

/**
 * Created by netchaev on 7/21/15.
 */
public class DivisionOverload {

    public static void main(String[] args) {
        double i = 0;
        double j = i / 0;
        System.out.println(Double.toString(j));
        System.out.println(Double.toString(Double.longBitsToDouble(0x7ff8000000000000L)));
    }
}
