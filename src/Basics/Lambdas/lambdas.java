package Basics.Lambdas;

public class lambdas {
    public static void main(String[] args) {
        // no parameter
        Greeting g = () -> System.out.println("Hello World");
        g.greeting();

        // single parameter
        Square s = x -> x * x;
        System.out.println(s.calculate(5));

        // multiple parameter
        Calculator c1 = (a, b) -> a+b;
        System.out.println(c1.calculate(10, 20));

        // block lambdas
        Calculator c2 = (a,b) -> {
            int multi = a*b;
            System.out.println("Product: "+multi);
            return multi;
        };
        
        System.out.println(c2.calculate(10, 20));
    }
}
