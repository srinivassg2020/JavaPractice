package pattern.arrays.general;

public class LengthOfLongestConcecutiveOnes {
    public static void main(String[] args){
        String A="111000";
        int cnt1=0,max=0, n= A.length();

        for(int i=0; i<n; i++){
            if(A.charAt(i)=='1')
                cnt1++;
        }
        if(cnt1==n)
            System.out.println("All ones Max: "+n);

        for(int i=0; i<n ; i++){
            System.out.println(" outside if 16"+A.charAt(i));
            if(A.charAt(i)=='0'){
                System.out.println(" inside if 16"+A.charAt(i));
                int l=0,r=0;
                for(int j=i-1; j>=0;j--){
                    if(A.charAt(j)=='1'){
                        l++;
                        System.out.println(" l "+l);
                    }else{
                        break;
                    }
                }
                for(int j=i+1; j<n;j++){
                    if(A.charAt(j)=='1'){
                        r++;
                    }else{
                        break;
                    }
                }
                int tempmax=0;
                if (cnt1 > l + r) {
                    tempmax = l + r + 1;
                } else {
                    tempmax = l + r;
                }
                //tempmax=l+r+1;
                //max=Math.max(max,tempmax);
                if (tempmax > max) {
                    max = tempmax;
                }
            }
        }

        System.out.println("Final Max: "+max);
    }
}
