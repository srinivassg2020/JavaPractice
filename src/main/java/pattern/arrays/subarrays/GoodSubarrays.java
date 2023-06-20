package pattern.arrays.subarrays;

public class GoodSubarrays {
    public static  void main(String[] args){
        int arr[]={1, 2, 3, 4, 5};
        int B=4,gsa=0;
        for(int i=0; i<arr.length;i++){
            int sum = 0, cnt=0;
            for(int j=i; j< arr.length; j++){
                sum+=arr[j];
                cnt++;
                System.out.print(arr[j] +" ");
                if(j-i+1%2==0 && sum <B) {
                    System.out.println(" even " + sum);
                    gsa++;
                }else if(j-i+1%2==1 && sum > B){
                    System.out.println(" odd "+sum);
                    gsa++;
                }
            }

           // System.out.println(sum +" ");
        }
       // System.out.println( "gsa :  "+gsa);
    }
}
