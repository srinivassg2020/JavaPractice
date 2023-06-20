package pattern.arrays;

public class FindMinMaxArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
       // min = Integer.MAX_VALUE;
       // max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }  if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print(max + " " + min);
    }
}
