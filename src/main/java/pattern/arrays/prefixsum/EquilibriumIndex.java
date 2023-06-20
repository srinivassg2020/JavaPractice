package pattern.arrays.prefixsum;

public class EquilibriumIndex {
    public static void main(String[] args){
        int leftSum=0, rightSum=0,eq=0;
       // int[] arr = {2, 5, 3, 1, 7, 10, 23};
        int[] arr = {1, 2, 3, 4,5, 10};
        for (int i = 0; i < arr.length; i = i + 1)
        {
            leftSum = 0;
            for (int j = 0; j < i; j = j + 1)
                leftSum = leftSum + arr[j];

            rightSum = 0;
            for (int j = i + 1; j < arr.length; j = j + 1)
                rightSum = rightSum + arr[j];

            if (leftSum == rightSum) {
                System.out.println("Equlibrium: " + i);
                eq++;
            }
        }
        if(eq <1)
            System.out.println("Equlibrium: "+ -1);

    }
}
