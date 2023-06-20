package pattern.arrays;

import org.w3c.dom.html.HTMLAppletElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingCart {
    public  static final String  APPLE_PRICE= "1.00";
    public  static final String  BANANA_PRICE= "0.10";
    public  static final String  ORRANGE_PRICE= "0.50";
    public  static final String  LEMON_PRICE= "0.05";

    public static void main(String[]args) {
        // 4 Apple (1) orage (.50 ), Apple (1) , banana(.10) lemon(.05)
    final String  APPLE= "1.00";
    Scanner scan = new Scanner(System.in);
    int fruitNum = scan.nextInt();
    String[] arr = new String[fruitNum];
    for(int i=0; i< fruitNum; i++){
        arr[i] = (scan.next());

    }
    double bill =getCaluculatBill(arr);
    System.out.print("Final Bill : "+(bill));

    }

public static double getCaluculatBill(String[] arr){
    double finalBillVal = 0;

    for(int i=0; i< arr.length; i++){
        if (arr[i].equals("APPLE")){
            finalBillVal= finalBillVal+ Double.parseDouble(APPLE_PRICE);
        }else if (arr[i].equals("ORRENGE")){
            finalBillVal= finalBillVal+ Double.parseDouble(ORRANGE_PRICE);
        }if (arr[i].equals("BANANA")){
            finalBillVal= finalBillVal+ Double.parseDouble(BANANA_PRICE);
        }if (arr[i].equals("LEMON")){
            finalBillVal= finalBillVal+ Double.parseDouble(LEMON_PRICE);
        }
    }

    return finalBillVal;
}


}
