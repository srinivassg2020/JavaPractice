package pattern.arrays.general;

public class MajarityElement {

    public static  void main(String[] args){
        //TC :  O(n).  SP: O(1);
        int[] A={2,1,2};
        int ans=0, max=(int)Math.floor(A.length/2), freq=1,ele=A[0];

        for(int i=1;i<A.length;i++){
            if(freq==0) ele=A[i];
            if(ele==A[i]) freq++;
            else if(ele!=A[i]) freq--;
        }
        freq=0;
        for(int i:A)
            if(ele==i)freq++;
        if(freq>=max)
            System.out.print(ele);
        System.out.print(0);
    }
}
