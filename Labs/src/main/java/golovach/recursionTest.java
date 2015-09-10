package golovach;

/**
 * Created by netchaev on 8/13/15.
 */
public class recursionTest {

    public static int fib (int arg){
        System.out.println(" " + arg);
        return (arg < 2) ? 1 : fib(arg - 2) + fib(arg -1);
    }

    public static void recursion (int num){
        System.out.println(" " + num);
        if (num < 7){
            recursion(2 * num);
        }
    }

    public static void main(String[] args) {

        //recursion(1);
        System.out.println("Fibonachi return: " + fib(5));
    }
}
