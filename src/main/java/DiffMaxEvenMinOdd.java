import java.util.Arrays;

public class DiffMaxEvenMinOdd {
    public  static void main (String args[]){
         int[] arr = { 2, 5, 7, 9, 6 };
        //int[] arr = { 1, 1, 1 };
        int sum = 2;
        getDiffValue(arr);
    }

    private static void getDiffValue(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int max = 0;
        int min = 0;
        for(int i=0; i<n; i++) {
            if(arr[i]>max && arr[i]%2==0) {
                max = arr[i];
            }
        }
        System.out.print("Max: "+max);
        for(int i=0; i<n; i++) {
            int min1 = arr[i];
            if(min1%2 == 1) {
                min = min1;
                break;
            }
        }
        int d = max-min;
        System.out.print("Diff: "+d);
    }
}
