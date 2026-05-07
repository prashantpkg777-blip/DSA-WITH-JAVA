package ArrayProblems;

import java.util.Arrays;

public class ProblemSheet3 {
    // Sort an Array of 0s and 1s

    static int[] sort0s1s(int[] arr){
        int n = arr.length;
        int i = 0, j = n-1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[i] == 0){
                i++;
            }
            if (arr[j] == 1){
                j--;
            }
        }
        return arr;
    }

    static void main() {

        // sort 0s and 1s
        int[] arr = {1,0,0,1,1,0,0,1};
        System.out.println(Arrays.toString(sort0s1s(arr)));
    }
}
