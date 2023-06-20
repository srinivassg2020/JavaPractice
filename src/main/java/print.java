import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class print {
     static String str;
     public void print(){
         System.out.print("222222");
         str="SSSSSSS";
     }
     public static void main(String args[]){
         print p = new print();
         System.out.print(str);
         function();
         printTribe1(10);
     }

     static void function(){
         int i=0;
         int s=0;
         while (i<100){
             s=s+i;
             s=i+s;
             i+=1;
         }
         System.out.print(s);
     }


     static int printTribe(int n) {
         if (n == 0 || n == 1 || n == 2)
             return 0;
             if (n == 3)
                 return 1;
             else
                 return printTribe(n - 1) + printTribe(n - 2) + printTribe(n - 3);

     }
    static int printTribe1(int n) {
         for (int i=1; i<n; i++){
             System.out.print(printTribe(i));
        }
        return n;
    }

    }
