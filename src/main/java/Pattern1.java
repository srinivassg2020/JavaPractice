import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String space="";
        int t=n-2;
        while(n>0){
             System.out.println("*"+getSpace(t)+"*");
             n=n-1;
        }
    }
    public static String getSpace(int t){
        String space="";
        while(t>0){
            space=space+" ";
            t=t-1;
        }
        return space;
    }
}
