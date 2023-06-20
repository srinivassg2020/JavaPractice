package pattern.arrays;

public class ArrayItemCube {
    public static void main (String[] args){
        int[] A = {2,4,6,8 };
        long[] res = new long[A.length];

        for(int i=0; i< A.length; i++){
            long cube = A[i] * A[i] * A[i];
            System.out.println(cube);
            res[i] = cube;
        }
    }
}
