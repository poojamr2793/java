import java.util.*;

// Function to segregate 0s and 1s
class GfG {

    static void segregate0and1(Integer[] arr) {

        // Count 0s
        int count = 0;
        for (int x : arr)
            if (x == 0)
                count++;

        // Fill the array with 0s until count
        for (int i = 0; i < count; i++)
            arr[i] = 0;

        // Fill the remaining array space with 1s
        for (int i = count; i < arr.length; i++)
            arr[i] = 1;
    }

    public static void main(String[] args) {
        Integer[] arr = {0, 1, 0, 1, 1, 1};

        segregate0and1(arr);

        for (int x : arr)
            System.out.print(x + " ");
    }
}
