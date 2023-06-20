package pattern.arrays.carryforward;

public class PrintAllSubArraySum {
    public static void main(String[] args){
        //int arr[]={1,2,3,4};
        int arr[]={3,-1,4}; // 3 , -1 , 4, 3 -1 , 3 -1 4 , -1 4 --> 3 + -1 + 4 + 2 + 6 + 3 ==17
       int ans=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                ans=ans+sum;
            }
            System.out.print(" Summ subarray : "+sum);
            //if(j<arr.length)
              //  sum+=arr[j];
        }
        System.out.print(" Summ ALL : "+ans);
    }
}
