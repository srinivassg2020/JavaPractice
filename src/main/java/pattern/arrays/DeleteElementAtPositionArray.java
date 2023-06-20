package pattern.arrays;

import java.util.Scanner;

public class DeleteElementAtPositionArray {

    public static void main(String[] args){
       int[] arr={2,5,3,8,10, 54,6};
        int[] arr1= new int[arr.length-1];
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();

        for(int i=0;i<arr.length;i++){
            int j=0;
            if (i==n) {
            }else{
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
