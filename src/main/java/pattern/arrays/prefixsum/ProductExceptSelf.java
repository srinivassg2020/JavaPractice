package pattern.arrays.prefixsum;

public class ProductExceptSelf {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4,5, 10};
        int length = arr.length;
        int leftProd[] = new int[length];
        int rightProd[] = new int[length];

        leftProd[0] = 1;
        for(int i=1;i<length;i++)
            leftProd[i]=leftProd[i-1]*arr[i-1];

        rightProd[length-1]=1;
        for(int i=length-1;i>=1;i--)
            rightProd[i-1] = rightProd[i]*arr[i];

        for(int i=0;i<length;i++)
            arr[i] = leftProd[i]*rightProd[i];
        for(int i=0;i<arr.length;i++)
        System.out.println("Arra prodcut: "+arr[i]);
    }
}
