package pattern.arrays.prefixsum;

public class EquilibriumIndexPrefixSum {
    public static void main(String[] args){
        // We are running two separate loops for calculating prefix sum array and equilibrium index, respectively.
        // Time complexity = Time complexity of calculating prefix sum array +
        // Time complexity of calculating equilibrium Index = O(n) + O(n) = O(n)
        // The above solution uses extra space to store prefix sum array. Space complexity = O(n).
        int eq=0;
        // int[] arr = {2, 5, 3, 1, 7, 10, 23};
        int[] arr = {1, 2, 3, 4,5, 10};
        int[] prefix= new int[arr.length];
        for (int i = 0; i < arr.length; i = i + 1)
        {
            if (i == 0)
                prefix[i] = arr[i];
            else
                prefix[i] = arr[i] + prefix[i - 1];
        }

        int totalSum = prefix[arr.length - 1];
        for (int i = 0; i < arr.length; i = i + 1)
        {
            int leftSum = prefix[i] - arr[i];
            int rightSum = totalSum - prefix[i];
            if (leftSum == rightSum)
                System.out.println("Equlibrium: "+ i);
        }

        if(eq <1)
            System.out.println("Equlibrium: "+ -1);

    }
}
