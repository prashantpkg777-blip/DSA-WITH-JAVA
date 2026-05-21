package Sorting;

public class binarySearch {

    static int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] >= target){
                // ans store
                ans = mid;
                // move to left
                end = mid - 1;
            }
            else {
                // move to right
                start = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] <= target){
                // move to right
                start = mid + 1;
            }
            else {
                // ans store
                ans = mid;
                // move to left
                end = mid - 1;
            }
        }
        return ans;
    }

    static void main() {
        int[] arr = {10,20,30,30,30,30,40,40,50};
        System.out.println("Index of lowerBound 30s: "+ lowerBound(arr,30));
        System.out.println("Index of upperBound 30s: "+ upperBound(arr,30));
    }
}
