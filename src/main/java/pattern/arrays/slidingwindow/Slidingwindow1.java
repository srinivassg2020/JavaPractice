package pattern.arrays.slidingwindow;

public class Slidingwindow1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int w=3, s=0,e=w-1;
        int cur_sum=0,max_sum=Integer.MIN_VALUE;
        for(int i=0;i<w; i++){
            cur_sum+=arr[i];
        }
        max_sum=cur_sum;

        for(int i=w; i<arr.length; i++){
            cur_sum+=arr[i]-arr[i-w];
            max_sum=Math.max(max_sum,cur_sum);
        }
        System.out.println(max_sum);
    }
}
