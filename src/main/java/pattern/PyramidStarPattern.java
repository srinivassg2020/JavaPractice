package pattern;

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        for (int i = 0; i < size; i++) {
            // print spaces
            for (int j = 0; j < size - i - 1; j++) { // 0<4 "" , 1<3 "  "
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k < 2 * i + 1; k++) { //  0<1 * 1<3 ** 2<3 ***   ,
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
