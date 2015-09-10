package golovach;

import java.util.Arrays;

/**
 * Реализовать метод, умножающий две 2-мерные матрицы (не обязательно квадратные).
 Произведение двух двумерных матриц матриц A и B размером NxM и MxK- это матрица С размером NxK, где каждый элемент C[i][j] высчитывается по формуле:
 C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ... + A[i][N-1]*B[N-1][j]
 Пример:

 |1 2|   |3 4 5 6|   |21 4  7  10|
 |7 8| * |9 0 1 2| = |93 28 43 58|
 |3 4|               |45 12 19 26|
 так как
 1*3 + 2*9 = 21, 1*4 + 2*0 = 4, 1*5 + 2*1 = 7, 1*6 + 2*2 = 10
 7*3 + 8*9 = 93, 7*4 + 8*0 = 28, 7*5 + 8*1 = 43, 7*6 + 8*2 = 58
 3*3 + 4*9 = 45, 3*4 + 4*0 = 12, 3*5 + 4*1 = 19, 3*6 + 4*2 = 26
 1. Если один из аргументов равен null - thcol1andRow2 new IllegalArgumentException().
 2. Если один из аргументов НЕ прямоугольная/квадратная матрица - thcol1andRow2 new IllegalArgumentException().
 3. Если одна из матриц содержит null в качестве строки - thcol1andRow2 new IllegalArgumentException().
 4. Если ширина первой матрицы не равна высоте второй матрицы - thcol1andRow2 new IllegalArgumentException().

 Подсказка: вам необходим тройной вложенный цикл.
 * Created by netchaev on 8/4/15.
 *
 * array[ROW][COLUMN]
 */
public class MatricMultiplication {
    public static int [][] matrix1 = {
            {1,2},
            {7,8},
            {3,4}
    };

    public static int [][] matrix2 = {
            {3,4,5,6},
            {9,0,1,2}
    };

    public static int[][] mul(int[][] fst, int[][] snd) {
        int sizeMatrix1 = fst.length;
        System.out.println(sizeMatrix1);
        int sizeMatrix2 = snd.length;
        int tallestMatrix = 0;

        int [][] resultMatrix = {};

        if (sizeMatrix1 > sizeMatrix2) {
            int numRowLargest = sizeMatrix1;
            int numColMatrix1 = fst[0].length;
            int numColMatrix2 = snd[0].length;
            int numColm1AndnumRowm2 = fst[0].length;
            System.out.println("col1andRow2 * col1 length: " + numColm1AndnumRowm2);

            for(int col1 = 0; col1 < numColMatrix1; col1++){
                int [] multiplierArray = new int [2];
                for (int col1andRow2 = 0; col1andRow2 < numColm1AndnumRowm2; col1andRow2++){
                    //                = row0col0
                    int multiplicator = fst[col1][col1andRow2] * snd[col1andRow2][col1];
                    multiplierArray[col1andRow2] = multiplicator;
                }
                System.out.println(Arrays.toString(multiplierArray));

            }


        }else{
            tallestMatrix = sizeMatrix2;
        }


        return null;
    }

    public static void main(String[] args) {
        int [][] result = mul(matrix1, matrix2);
        System.out.println(Arrays.deepToString(matrix1));
        System.out.println(matrix2[0][1]);
    }

}
