package pattern.search;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr={3,5,7,8,15,27,50};
        int x=15;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                System.out.println(" Found");;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        System.out.println("Not Found");
    }
}
