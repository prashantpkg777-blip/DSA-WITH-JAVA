package Recursion;

import java.util.Arrays;

public class mergeSortProblem {
    public static void main(String[] args) {
        int[] arr = new int[]{8,6,9,3,7,5,1,3,7,2};
        int n = arr.length;
        int l=0,r=n-1;

        mergeSort(arr,l,r);

        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int arr[], int l, int r) {
        // base case
        if(l >= r){
            return;
        }

        // mid
        int mid = l +(r-l)/2;

        // sort left halves
        mergeSort(arr,l,mid);

        // sort right halves
        mergeSort(arr,mid+1,r);

        // merge both halves
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr, int l, int mid, int r){
        // length

        int leftLen = mid-l+1;
        int rightLen = r-mid;

        int left[] = new int[leftLen];
        int right[] = new int[rightLen];

        // copy element
        for(int i =0; i<leftLen; i++){
            left[i] = arr[l+i];
        }

        for(int j =0; j<rightLen; j++){
            right[j] = arr[mid+1+j];
        }

        // campare and merge
        int i=0, j=0, k=l;
        while(i < leftLen && j < rightLen){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        // copy rem. elements
        while(i < leftLen){
            arr[k++] = left[i++];
        }

        while(j < rightLen){
            arr[k++] = right[j++];
        }

    }
}
