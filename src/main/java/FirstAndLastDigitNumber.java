import java.util.Scanner;

public class FirstAndLastDigitNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++){
            int r=0;
            int n = scan.nextInt();
            System.out.print(firstNumber(n)+" "+lastNumber(n));
        }
      }

    public static int firstNumber(int n){
        //int n1 = n;
        while(n>=10)
            n=n/10;
        return n;
    }
    public static int lastNumber(int n){
        return n%10;
    }
}
