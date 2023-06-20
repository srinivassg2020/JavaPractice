package pattern.arrays.prefixsum;

public class EquilibriumIndexPrefixTnS1 {
    public static void main(String[] args){
        // We are running two separate loops for calculating total sum and equilibrium index, respectively.
        // Time complexity = Time complexity of calculating total sum +
        // Time complexity of finding equilibrium index = O(n) + O(n) = O(n).
        // Space complexity = O(1), we only use variables to store total, left, and right sum.
        int totalSum = 0, leftSum = 0, eq=0;
        // int[] arr = {2, 5, 3, 1, 7, 10, 23};
        int[] arr = {1, 2, 3, 4,5, 10};

        for (int i = 0; i < arr.length; i = i + 1)
            totalSum = totalSum + arr[i];

        for (int i = 0; i < arr.length; i = i + 1)
        {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum){
                System.out.println("Equlibrium: "+ i);
                eq++;
            }
            leftSum = leftSum + arr[i];
        }
        if(eq <1)
            System.out.println("Equlibrium: "+ -1);
    }
}
