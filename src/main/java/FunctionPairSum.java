import java.util.HashMap;

public class FunctionPairSum {
    public  static void main (String args[]){
       // int[] arr = { 1, 5, 7, -1, 5 };
        int[] arr = { 1, 1, 1 };
        int sum = 2;
        getPairsCount(arr, sum);
    }
     public static void getPairsCount(int[] arr, int sum){
         HashMap<Integer, Integer> m = new HashMap<>();
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if (m.containsKey(sum - arr[i])) {
                 count += m.get(sum - arr[i]);
             }


             if (m.containsKey(arr[i])) {
                 m.put(arr[i], m.get(arr[i]) + 1);
             }
             else {
                 m.put(arr[i], 1);
             }
         }
         System.out.println( count);
     }
}
