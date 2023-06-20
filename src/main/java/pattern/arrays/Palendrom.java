package pattern.arrays;

import java.util.Scanner;

public class Palendrom {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int r =0, sum=0, temp=n;
        while(n>0){   //121
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp == sum ){
            System.out.print("palindrom "+temp);
        }else{
            System.out.print("Not palindrom "+temp);
        }
    }
}
