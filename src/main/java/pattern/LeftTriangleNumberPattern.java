package pattern;

import java.util.Scanner;

public class LeftTriangleNumberPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        for(int i = 0; i < size; i++) {
           for(int j=1; j<=i; j++){
               System.out.print(j);
           }
            System.out.println();
        }
    }
}
