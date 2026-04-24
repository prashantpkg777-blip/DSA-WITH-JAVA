package OOP.Transport;

public class car extends vehicle {
    public int noOfDoor;
    public String transmissionType;

    car(String name, String model, int noOfTyre, int noOfDoor, String transmissionType) {
        super(name,model,noOfTyre); // super() is used for parent
        this.noOfDoor = noOfDoor;
        this.transmissionType = transmissionType;
    }

    public void startAC() {
        System.out.println("AC started of "+ name);
    }
}
