package ArrayProblems;

import java.util.Arrays;

public class ProblemSheet1 {
    // Average of array
    static double getAvg(int arr[]) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    // Multiply each element by 10
    static int[] multiplyBy10(int arr[]) {
        int newArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i]*10;
        }
        return newArray;
    }

    // Linear search
    static boolean findTarget(int arr[], int target) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
    static void main() {

        int arr[] = {5,6,9,3,8,2,7,1};
        // avg
        System.out.println(getAvg(arr));
        // multiply by 10
        System.out.println(Arrays.toString(multiplyBy10(arr)));
        // linear search
        System.out.println(findTarget(arr, 9));

    }
}
