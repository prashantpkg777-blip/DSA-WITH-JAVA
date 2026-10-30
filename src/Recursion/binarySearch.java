
package Recursion;

public class binarySearch {

    int BinSearch(int[] arr, int s, int e, int target) {

        // Base case
        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Search left half
        else if (arr[mid] > target) {
            return BinSearch(arr, s, mid - 1, target);
        }

        // Search right half
        else {
            return BinSearch(arr, mid + 1, e, target);
        }
    }

    public static void main(String[] args) {

        binarySearch obj = new binarySearch();

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        int target = 70;

        int result = obj.BinSearch(
                arr, 0, arr.length - 1, target
        );

        System.out.println("Index: " + result);
    }
}
