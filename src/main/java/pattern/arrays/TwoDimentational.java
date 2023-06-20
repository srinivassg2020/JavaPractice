package pattern.arrays;

import java.util.Scanner;

public class TwoDimentational {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        arr[0][0] = 1;

        System.out.println("arr[0][0] = " + arr[0][0]);

        // second

        int[][] arr2 = { { 1, 2, 4 }, { 3, 4, 6  } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }

            System.out.println();
        }
        //thrid
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr2[j][i] + " ");
            }

            System.out.println();
        }
    }
}
