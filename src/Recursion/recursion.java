package Recursion;

public class recursion {
    // factorial
    int fact(int n){
        // base case
        if(n==0){
            return 1;
        }
        // recursive call
        return n * fact(n-1);
    }

    // power of 2
    int powerOf2(int n){
        if(n==0){
            return 1;
        }

        return 2 * powerOf2(n-1);
    }

    // fibonacci no
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        recursion f = new recursion();

        System.out.println(f.fact(5));
        System.out.println(f.fact(6));

        System.out.println(f.powerOf2(5));
        System.out.println(f.powerOf2(6));

        System.out.println(f.fib(5));
        System.out.println(f.fib(6));
    }
}
