package dsa;

import java.util.Arrays;

class LeetCode2022 {

    //2022 - Convert 1D Array Into 2D Array

    /*You are given a 0-indexed 1-dimensional (1D) integer array original, and two integers, m and n.
    You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using all the elements from original.
    The elements from indices 0 to n - 1 (inclusive) of original should form the first row of the constructed 2D array,
    the elements from indices n to 2 * n - 1 (inclusive) should form the second row of the constructed 2D array, and so on.
    Return an m x n 2D array constructed according to the above procedure, or an empty 2D array if it is impossible.
    */

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length == (m * n)) {
            int[][] array;
            if (original.length >= n) {
                array = new int[m][n];
                int a = 0, b = 0, i = 0;
                for (i = 0; i < original.length; i++) {
                    array[a][b] = original[i];
                    b++;
                    if (b == n) {
                        a++;
                        b = 0;
                    }
                }
                return array;
            } else {
                return new int[0][0];
            }
        } else {
            return new int[0][0];
        }
    }

    public static void main(String[] args) {

        /*Example 1:
        Input: original = [1,2,3,4], m = 2, n = 2
        Output: [[1,2],[3,4]]
        Explanation: The constructed 2D array should contain 2 rows and 2 columns.
                     The first group of n=2 elements in original, [1,2], becomes the first row in the constructed 2D array.
                     The second group of n=2 elements in original, [3,4], becomes the second row in the constructed 2D array.*/

        int[][] example1 = construct2DArray(new int[]{1, 2, 3, 4}, 2, 2);
        System.out.println(Arrays.deepToString(example1));

        /*Example 2:
        Input: original = [1,2,3], m = 1, n = 3
        Output: [[1,2,3]]
        Explanation: The constructed 2D array should contain 1 row and 3 columns.
                     Put all three elements in original into the first row of the constructed 2D array.*/

        int[][] example2 = construct2DArray(new int[]{1, 2, 3}, 1, 3);
        System.out.println(Arrays.deepToString(example2));

        /*Example 3:
        Input: original = [1,2], m = 1, n = 1
        Output: []
        Explanation: There are 2 elements in original.
                     It is impossible to fit 2 elements in a 1x1 2D array, so return an empty 2D array.*/

        int[][] example3 = construct2DArray(new int[]{1, 2}, 1, 1);
        System.out.println(Arrays.deepToString(example3));
    }
}