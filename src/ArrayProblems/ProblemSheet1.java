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

    // Find max element
    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    // max using Math.max()
    static int findMaxi(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    // Find positive and negative Sum
    static int[] getPosNegSum(int arr[]){
        int posSum = 0;
        int negSum = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0){
                // for positive num
                posSum += arr[i];
            }
            else {
                // for negative num
                negSum += arr[i];
            }
        }
        int ans[] = {posSum,negSum};
        return ans;
    }

    // Count zeros and ones
    static int[] getZeroOneCount(int arr[]){
        int zeroCount = 0;
        int oneCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                // for positive num
                zeroCount++;
            }
            else {
                // for negative num
                oneCount++;
            }
        }
        int ans[] = {zeroCount,oneCount};
        return ans;
    }

    // Find unSorted Element
    static int getUnSortedElement(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i+1] > arr[i]){
                // Everything is OK
            }
            else {
                // Everything is NOK
                return arr[i+1];
            }
        }
        return -1;
    }

    static void main() {

        int arr[] = {5,-6,9,-3,-8,-2,7,1};
        // avg
        System.out.println(getAvg(arr));

        // multiply by 10
        System.out.println(Arrays.toString(multiplyBy10(arr)));

        // linear search
        System.out.println(findTarget(arr, 9));

        // find max
        System.out.println(findMax(arr));
        System.out.println(findMaxi(arr));

        // positive and negative sum
        int ans[] = getPosNegSum(arr);
        System.out.println("Positive Sum: " + ans[0]);
        System.out.println("Negative Sum: " + ans[1]);

        // Count Zero and One
        int [] arr1 = {0,1,1,0,0,1,0};
        int ans1[] = getZeroOneCount(arr1);
        System.out.println("Zero Count: " + ans1[0]);
        System.out.println("One Count: " + ans1[1]);

        // Find UnSorted Element
        int [] arr2 = {1,2,4,6,5,7,9};
        System.out.println(getUnSortedElement(arr2));


    }
}
