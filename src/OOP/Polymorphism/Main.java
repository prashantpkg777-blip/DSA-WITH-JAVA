package OOP.Polymorphism;

public class Main {

    static void main() {

        // Overloading

        Calculator c = new Calculator();

        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4));
        System.out.println(c.add(2,3,4,5.6));

        // Runtime Polymorphism (override)

        Circle ci = new Circle();
        doDrawingStuff(ci);

        Rectangle r = new Rectangle();
        doDrawingStuff(r);

        Shape s = new Shape();
        doDrawingStuff(s);
    }

    public static void doDrawingStuff(Shape s) {
        s.draw(); // polymorphic
    }
}
