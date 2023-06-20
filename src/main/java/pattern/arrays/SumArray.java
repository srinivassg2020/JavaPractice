package pattern.arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sumArr = new int[5];

        for (int i = 0; i <arr.length; i++) {
            int sum=0;
            for(int j=0; j<=i;j++){
                sum= sum + j;
            }
            sumArr[i]=sum;
        }
        for(int k=0;k<sumArr.length;k++){
            System.out.print(sumArr[k] + " ");
        }
      //  System.out.print(max + " " + min);
    }
}
