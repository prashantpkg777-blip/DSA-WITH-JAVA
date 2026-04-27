package OOP.Inheritance;
// Inheritance
public class vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public vehicle() {
    }

    void startEngine() {
        System.out.printf("Engine is Starting of %s : %s\n", name,model);
    }

    void stopEngine() {
        System.out.printf("Engine is Stopping of %s : %s\n", name,model);
    }
}
