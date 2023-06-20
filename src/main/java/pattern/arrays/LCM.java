package pattern.arrays;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int lcm=0;
        if(m%n==0){
            lcm =m;
        }else{
            for(int i=1;i<=m;i++){
                if(m*i%n==0) {
                    lcm = m * i;
                    break;
                }
            }
        }
        System.out.println("LCM : "+lcm);

    }
}
