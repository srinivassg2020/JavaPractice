package pattern.arrays;

public class SumOfTwoValuesK {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //int[] sumArr = new int[arr.length];
        int k=10;
        for (int i =0; i < arr.length; i++) {
            for(int j=0; j<arr.length; j++){
            if(arr[i] +arr[j]==k && !(i ==j)){
                System.out.print(arr[i] + ", "+arr[j+1]);
             }
            }
        }
        //int(max + " " + min);
    }
}
