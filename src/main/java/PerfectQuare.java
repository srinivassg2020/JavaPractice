import java.util.Scanner;

public class PerfectQuare {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int i=1;
        //Perfect square number
        /*while(i*i<=n){
            System.out.println(i*i);
            i++;
        }*/
        //revers number
        while(n>0){
            System.out.println(n%10);
            n=n/10;
        }
    }
}
