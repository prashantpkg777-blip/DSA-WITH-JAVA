package Basics;

public class BitwiseOperator {
    static void main() {
        // Bitwise operator

        int a = 5;
        int b = 6;

        System.out.println(a&b); //4
        System.out.println(a|b); //7
        System.out.println(a^b); //3
        System.out.println(~a); //-6
        System.out.println(~b); //-7
        System.out.println(a<<b); //320
        System.out.println(a>>b); //0

        System.out.println("Right Shift");
        int n =5;
        for (int i =1; i <= 32; i++) {
            n = n << 1; // (every right shift is multiply * by 2)
            System.out.println(n);
        }

        System.out.println("Left Shift");
        int m = 100;
        for (int i =1; i <= 10; i++) {
            m = m >> 1; // (every left shift is divide / by 2)
            System.out.println(m);
        }

        // Even and Odd method
        int x = 1777;
        if ((x&1) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // check a number is power of 2 or not
        int y = 6;
        if ((y&(y-1)) == 0) {
            System.out.println("Power of 2");
        }
        else{
            System.out.println("Not a Power of 2");
        }

        // Swap two numbers using XOR
        int p = 99;
        int q = 33;

        p = p ^ q;
        q = p ^ q;
        p = p ^ q;

        System.out.println(p);
        System.out.println(q);

        // find unique element
        int[] arr = {12,25,17,25,13,12,17};
        int xor = 0;
        for (int i =0;i<arr.length;i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);

        // remove last SetBit
        int l = 10;
        System.out.println((l&(l-1)));

        // get last setbit
        System.out.println(l&(-l));

    }
}
