package pattern;

import java.util.Scanner;

public class FactorsCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int fc= 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                fc++;
            }
        }
        System.out.println("FC : "+fc);
    }
}
