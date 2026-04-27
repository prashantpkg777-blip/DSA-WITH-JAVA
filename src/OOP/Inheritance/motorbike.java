package OOP.Inheritance;

public class motorbike extends vehicle {
    public String handleBarStyle;
    public String suspensionType;

    motorbike (String name, String model, int noOfTyre, String handleBarStyle, String suspensionType) {
        super(name,model,noOfTyre);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    public void wheelie() {
        System.out.println("MotorBike is doing Wheelie "+ name);
    }
}
