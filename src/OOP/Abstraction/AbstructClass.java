package OOP.Abstraction;

// Abstract class

abstract class Bird1 {
    abstract void Fly();
    abstract void Eat();
    void Sleep(){
        System.out.println("Bird sleep");
    }

}

class Sparrow1 extends Bird1{

    @Override
    void Fly() {
        System.out.println("Sparrow is Flying");
    }

    @Override
    void Eat() {
        System.out.println("Sparrow is Eating");
    }
}

class Crow1 extends Bird1{

    @Override
    void Fly() {
        System.out.println("Crow is Flying");
    }

    @Override
    void Eat() {
        System.out.println("Crow is Eating");
    }
}

public class AbstructClass {

    public static void doBirdStuff(Bird1 b){
        b.Eat();
        b.Fly();
        b.Sleep();
    }
    static void main() {
        doBirdStuff(new Sparrow1());
        doBirdStuff(new Crow1());
    }
}
