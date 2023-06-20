package pattern;

import java.util.Scanner;

public class AlphabetSquarePattern {
    public static void main(String[] args){
       // Scanner scan = new Scanner(System.in);
       // int n = scan.nextInt();
        // size
        int n = 5;
        int alpha = 65;
        for(int i=0; i<n;i++){
            for (int j=0; j<n; j++){
                System.out.print((char)(alpha+j));
            }
            System.out.println("");
        }
    }
}
