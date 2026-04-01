public class datatypes {
    static void main() {
        // numeric type
        // integer
         byte b =127;
        System.out.println(b);

        short s=1000;
        System.out.println(s);

        int i = 100000;
        System.out.println(i);

        long l = 100000000;
        System.out.println(l);

        // floating point
        float f = 3.1466f;
        System.out.println(f);

        double d = 3.1456566556;
        System.out.println(d);

        // other- boolean, char

        boolean iAmEiligible = true;
        System.out.println(iAmEiligible);

        char firstChar = 'a';
        System.out.println("Third char:"+ (char)(firstChar+2));

        //Type Casting

        // Implicit
        int x = 10;
        long y = x;
        System.out.println(y);

        // Explicit
        double n1= 10.55;
        int n2 = (int)n1;
        System.out.println(n2); //data loss o/p:10
    }
}
