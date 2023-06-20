package pattern;

import java.util.Scanner;

public class RightTriangleNumberPattern {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int num=1;
        for(int i =n; i >0 ; i--) {
            for(int j=1; j<=n; j++){
                if(j<=i){
                    System.out.print(" ");
                }else{
                    System.out.print(num++);
                }

            }
            num=1;
            System.out.println();
        }
    }
}
