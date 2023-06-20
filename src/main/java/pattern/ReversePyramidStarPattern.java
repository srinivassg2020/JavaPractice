package pattern;

import java.util.Scanner;

public class ReversePyramidStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*(size-i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
