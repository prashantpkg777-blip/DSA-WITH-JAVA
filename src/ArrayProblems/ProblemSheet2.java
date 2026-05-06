package ArrayProblems;
// Array Manipulation Problem

import java.util.HashMap;

public class ProblemSheet2 {

    // Reverse of Array
    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        // print reverse array
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    // shift element by 1 position
    static void shiftBy1(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    // find the mode
    static int getMode(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mode = arr[0];
        int maxCount = 0;

        // find highest frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxCount) {
                maxCount = map.get(key);
                mode = key;
            }
        }
        return mode;
    }

    // find highest and lowest frequent number
    static void getHighestLowestFrequentNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;

        int maxElement = arr[0];
        int minElement = arr[0];

        for (int key : map.keySet()) {
            int freq = map.get(key);

            // highest num
            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }

            // lowest num
            if (freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }
        }
        System.out.println("Highest Freq: " + maxFreq);
        System.out.println("Lowest Freq: " + minFreq);
        System.out.println("Highest Freq Number: " + maxElement);
        System.out.println("Lowest Freq Number: " + minElement);
    }

    static void main() {

        // reverse array
        int [] arr = {1,2,3,4,5,6};
        reverseArray(arr);

        System.out.println();
        // shift by 1
        shiftBy1(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        // MODE
        int arr1[] = {1,2,2,6,6,6,6,3,3,3,9};
        System.out.println("Mode of Array: "+ getMode(arr1));

        // highest and lowest freq
        getHighestLowestFrequentNumber(arr1);
    }
}
