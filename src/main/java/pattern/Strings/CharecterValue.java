package pattern.Strings;

public class CharecterValue {
    public static void main(String[] arg){
        // String str= "Srinivas Mekalal";
     int[] arr = {1,5,2,7, 3,2, 7,5 };
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count ==1 ){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
