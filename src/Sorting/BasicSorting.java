package Sorting;

import java.util.Arrays;

public class BasicSorting {

    static void bubbleSort(int[] arr){ // T.C -> O(n^2)
        int n = arr.length;
        for (int i = 0; i < n-1; i++){ // rounds
            for (int j = 0; j < n-1-i; j++){ // comparing element with neighbour
                if (arr[j] > arr[j+1]){ // Swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){ // T.C -> O(n^2)
        int n = arr.length;
        for (int i = 0; i<n-1; i++){
            int minIndex = i;
            // find minimum element
            for (int j =i+1; j< n; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i =1; i<n; i++){
            int currVal = arr[i];
            int j = i-1;

            // shift largest number
            while (j>=0 && arr[j] > currVal){
                arr[j+1] = arr[j];
                j--;
            }

            // insert element
            arr[j+1] = currVal;
        }
    }

    static void main() {
        int[] arr = {1,5,9,3,6};
        bubbleSort(arr);
        System.out.println("Print the sorted array:"+ Arrays.toString(arr));

        int[] arr2 = {9,6,5,7,3};
        selectionSort(arr2);
        System.out.println("Print the sorted array:"+ Arrays.toString(arr2));

        int[] arr3 = {2,5,9,3,6};
        insertionSort(arr3);
        System.out.println("Print the sorted array:"+ Arrays.toString(arr3));
    }
}
