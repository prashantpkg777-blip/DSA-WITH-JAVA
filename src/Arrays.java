import java.util.Scanner;

public class Arrays {
    static void main() {
//
//        // declaration
//        int arr[];
//        // allocation
//        arr = new int[5];
//        // initialisation
//        int brr[] = {10,20,30};
//
//        // Accessing
//        System.out.println("Value at 0 index: "+ brr[0]);
//        System.out.println("Value at 1 index: "+ brr[1]);
//        System.out.println("Value at 2 index: "+ brr[2]);
//
//        // by loops
//        for (int i =0; i <= 2; i++){
//            System.out.println(brr[i]);
//        }
//        // for each loop
//
//        for (int val: brr){
//            System.out.println(val);
//        }
//
//        // Taking input
//
//        Scanner sc = new Scanner(System.in);
//        int arr1[] = new int[5];
//        int n  = arr1.length;
//
//        //input
//        for (int i=0; i<= n-1; i++){
//            System.out.println("Provide input for index "+ i);
//            arr1[i] = sc.nextInt();
//        }
//
//        //print
//        System.out.println("Provided content are:");
//        for (int val: arr1){
//            System.out.println(val);
//        }
//
//        // Sum in array
//
//        int crr[] = {35,06,15,25,18,33};
//        int sum =0;
//        int n = crr.length;
//
//        for (int i=0; i<= n-1; i++){
//            int val = crr[i];
//            sum += val;
//        }
//
//        System.out.println("Sum of Array: " + sum);
//
//        // Multiply
//        int multi = 1;
//        for (int i=0; i<= n-1; i++){
//            int val = crr[i];
//            multi *= val;
//        }
//        System.out.println("Multiply of Array: "+ multi);
//
//        // Find Max and Min value inside in an array
//
//        int drr[] = {5,65,-58,99,46};
//        int maxVal = drr[0];
//        int x = drr.length;
//
//        for (int i=0; i<x; i++){
//            if (drr[i] > maxVal){
//                // update max value
//                maxVal = drr[i];
//            }
//        }
//
//        int minVal = drr[0];
//        for (int i=0; i<x; i++){
//            if (drr[i] < minVal){
//                // update min value
//                minVal = drr[i];
//            }
//        }
//        System.out.println("The Max value is "+maxVal +" and the Min value is "+  minVal);

        // 2D Array

//        // declaration
//        int [][]arr;
//        // allocation
//        arr = new int[3][4];
        // initiation
//        int [][]brr = {{1,2},{2,3},{3,4},{4,5}};
//
//        int rowLen = brr.length;
//        int colLen = brr[0].length;
//
//        for (int r =0; r < rowLen; r++){
//            for (int c=0; c < colLen; c++){
//                System.out.print(brr[r][c] + " ");
//            }
//            System.out.println(";");
//        }
//
//        int [][]brr = {{1,2},{2,3,4},{3,4,5,6},{4}};
//
//        int rowLen = brr.length;
//
//        for (int r =0; r < rowLen; r++){
//
//            int colLen = brr[r].length; // for non uniform column
//            for (int c=0; c < colLen; c++){
//                System.out.print(brr[r][c] + " ");
//            }
//            System.out.println(";");
//        }
//
//        // input
//
//        int crr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int r =0; r < crr.length; r++){
//            for (int c =0; c < crr[r].length; c++){
//                System.out.println("Provide value for row "+ r + " and column " +c);
//                crr[r][c] = sc.nextInt();
//            }
//        }
//        for (int r =0; r < crr.length; r++){
//            for (int c =0; c < crr[r].length; c++){
//                System.out.print(crr[r][c] +" ");
//            }
//            System.out.println(";");
//        }

        // Jagged array or Ragged array

        // declare
        int[][] arr = new int[3][];

        // allocate
        arr[0] = new int[2]; // row 0 → 2 columns
        arr[1] = new int[4]; // row 1 → 4 columns
        arr[2] = new int[3]; // row 2 → 3 columns

        // initiate
        arr[0] = new int[]{1, 2};
        arr[1] = new int[]{3, 4, 5, 6};
        arr[2] = new int[]{7, 8, 9};

        System.out.println(arr[1][2]); // Output: 5

         // sum
        int crr[][] = {{1,2},{2,3,4},{3,4,5,6},{4}};
        int sum = 0;

        for (int r =0; r < crr.length; r++){
            for (int c =0; c < crr[r].length; c++) {
                int value = crr[r][c];
                sum += value;
            }
        }
        System.out.println("Sum: "+ sum);

        // Multiply
        int mul = 1;

        for (int r =0; r < crr.length; r++){
            for (int c =0; c < crr[r].length; c++) {
                int value = crr[r][c];
                mul *= value;
            }
        }
        System.out.println("Multiply: "+ mul);

        // Max and Min value
        int maxVal = crr[0][0];
        int minVal = crr[0][0];

        for (int r =0; r < crr.length; r++){
            for (int c =0; c < crr[r].length; c++) {
                if (crr[r][c] > maxVal ){
                    maxVal = crr[r][c];

                }
                if (crr[r][c] < minVal ){
                    minVal = crr[r][c];

                }
            }
        }
        System.out.println("Max and Min values are "+ maxVal + " and "+minVal);
    }
}
