package OOP.Transport;

public class Main {
    static void main(String[] args) {
        car c = new car("Maruti","800",4,5,"Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        motorbike m = new motorbike("Splendor","CT100",2,"U","Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}
