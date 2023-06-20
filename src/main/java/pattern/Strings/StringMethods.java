package pattern.Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] arg){
        String str1= "Srinivas Mekalal";
      //  char ch = 'a';
        int num = 98;
        char ch1 = (char)num;
        //int charnum= (int)ch;
       // System.out.print("charnum: "+charnum);
       // System.out.print("ch1: "+ch1);


        Scanner scan = new Scanner(System.in);
        String str= scan.next();
        int position =0;
        int n= scan.nextInt();
       // System.out.print(str);

        char ch = (char)n;
       // System.out.print(n +". "+ch);
        for(int i=0;i<str.length(); i++){
            if (ch==str.charAt(i)){
                position=i;
            }else{
                position=-1;
            }
        }
        System.out.print(position);
    }
}
