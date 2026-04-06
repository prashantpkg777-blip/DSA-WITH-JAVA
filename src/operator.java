public class operator {
    static void main() {
        int a = 25;
        int b = 6;

        // Arithmetic operator
        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

        // Relational operator
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        // Logical operator
        boolean completedDSA = true;
        boolean completedCore = false;

        System.out.println(completedDSA && completedCore);
        System.out.println(completedDSA || completedCore);
        System.out.println(!completedDSA);

        // Assignnment operator
        int x = 10;

        x += 5;
        System.out.println(x);
        x -= 10;
        System.out.println(x);
        x *= 6;
        System.out.println(x);
        x /= 3;
        System.out.println(x);
        x %= 4;
        System.out.println(x);

        // Unary inc/dec operator
        int y = 10;

        System.out.println(-y);
        System.out.println(+y);

        System.out.println(y++);
        System.out.println(++y);

        System.out.println(y--);
        System.out.println(--y);

        // Ternary operator
        int age = 65;
        String result = (age > 18) ? "can vote" : "cannot vote" ;

        System.out.println(result);
    }
}
