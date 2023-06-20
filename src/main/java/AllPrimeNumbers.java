import javax.security.auth.login.CredentialException;
import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();

        for(int n=2;n<=max;n++) {
            //check if this number is prime
            if(isPrime(n)) {
                System.out.println(n);
            }
        }
    }
    public static boolean isPrime(int n){
        int flag=0;
        boolean prime=false;
        for(int i=2; i<=n; i++){
            if(n%i==0){
                flag=flag+1;
            }
        }
        if(flag==1){
           // CredentialException
            prime= true;
        }
        return prime;
    }
}
