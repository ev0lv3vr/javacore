package golovach;

import java.util.Arrays;

/**
 * Created by netchaev on 8/13/15.
 */
public class palindromeTest {

    public static boolean isPalindrome ( String word){

        boolean palindrome = true;

        char [] testWord = word.toCharArray();
        int wordLength = testWord.length;

        for (int i = 0; i < wordLength/2; i++){
            if (testWord[i] != testWord[wordLength - 1 - i]){
                palindrome = false;
            }
        }

        return palindrome;
    }

    public static void main(String[] args) {

        String word = "dogeeseseegod";

        if (isPalindrome(word)){
            System.out.println(word + " is a palindrome");
        }else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
