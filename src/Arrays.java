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

        // Sum in array

        int crr[] = {35,06,15,25,18,33};
        int sum =0;
        int n = crr.length;

        for (int i=0; i<= n-1; i++){
            int val = crr[i];
            sum += val;
        }

        System.out.println("Sum of Array: " + sum);

        // Multiply
        int multi = 1;
        for (int i=0; i<= n-1; i++){
            int val = crr[i];
            multi *= val;
        }
        System.out.println("Multiply of Array: "+ multi);

        // Find Max and Min value inside in an array

        int drr[] = {5,65,-58,99,46};
        int maxVal = drr[0];
        int x = drr.length;

        for (int i=0; i<x; i++){
            if (drr[i] > maxVal){
                // update max value
                maxVal = drr[i];
            }
        }

        int minVal = drr[0];
        for (int i=0; i<x; i++){
            if (drr[i] < minVal){
                // update min value
                minVal = drr[i];
            }
        }
        System.out.println("The Max value is "+maxVal +" and the Min value is "+  minVal);
    }
}
