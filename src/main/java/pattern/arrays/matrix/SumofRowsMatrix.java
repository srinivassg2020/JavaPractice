package pattern.arrays.matrix;

public class SumofRowsMatrix {
    public static void main(String []args){
        int[][] arr2 = { { 1, 2, 4 }, { 3, 4, 6  } };
        for(int i=0; i<arr2.length; i++){
            int sum = 0;
            for(int j=0; j<arr2[0].length;j++){
                sum= +sum + arr2[i][j];
            }
            System.out.println("Sum: "+sum);
        }
    }
}
