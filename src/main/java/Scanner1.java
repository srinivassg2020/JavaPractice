import java.util.Scanner;

public class Scanner1 {


    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // String input
      /*  int first1 = sc.nextInt();
        int first2 = sc.nextInt();
        if (first1 > first2){
            System.out.println(first2 +" is greater than "+first1);
        }else if(first1 < first2){
            System.out.println(first1 +" is greater than "+first1);
        }else if(first1 == first2){
            System.out.println(first1 +" is equals to "+first1);
        }else{
            System.out.println(first1 +" is not equals to "+first1);
        }*/
        // Character input


        /*double temp = sc.nextDouble();

        if (temp >= 97.6 && (temp <= 98.6)){
            System.out.println(" Temparature is Normal");
        }else if(temp < 97.6){
            System.out.println("low");
        }else if(temp > 98.6){
            System.out.println(" High ");
        }else System.out.println(" Invalid Temp ");*/

       /* int num = sc.nextInt();
        if(num %3 == 0 && num %5== 0){
            System.out.println(" FIZZBUZZ ");
        }else  if(num %3 == 0){
            System.out.println(" FIZ ");
        }else if (num %5 == 0){
            System.out.println(" BUZZ ");
        }else{
            System.out.println(" not divisible 3 & 5  ");
        }*/

        /*int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 < num2  && num2 < num3){
            System.out.println(num3 +" is greater than  "+ num1 +", "+num2);
        }*/

        System.out.print("enter 2 numbers: ");
        String str=sc.nextLine();
        str=str.trim();
        int a= Integer.parseInt(str.substring(0,str.indexOf(' ')));
        int b= Integer.parseInt(str.substring(str.indexOf(' ')));
        System.out.println("The two numbers are: "+ a +"and"+ b);
    }


}
