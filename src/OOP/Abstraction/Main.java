package OOP.Abstraction;

// Interface (Abstract design)

interface Bird {
    void Fly();
    void Eat();

    default void Sleep(){
        System.out.println("Bird Sleeping");
    }

}
interface Walk {
    int legs = 4;
    void Walk();
}

class Sparrow implements Bird , Walk {

    @Override
    public void Fly() {
        System.out.println("Sparrow is Flying");
    }

    @Override
    public void Eat() {
        System.out.println("Sparrow is Eating");
    }

    @Override
    public void Walk() {
        int a = Walk.legs;
        System.out.println("Sparrow is Walking");
    }
}

class Crow implements Bird , Walk {

    @Override
    public void Fly() {
        System.out.println("Crow is Flying");
    }

    @Override
    public void Eat() {
        System.out.println("Crow is Eating");
    }

    @Override
    public void Walk() {
        System.out.println("Crow is Walking");
    }
}

public class Main {

    public static void doBirdStuff(Bird b){
        b.Eat();
        b.Fly();
        b.Sleep();

    }
    static void main() {
        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());
    }
}
