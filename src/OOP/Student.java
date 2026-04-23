package OOP;

public class Student {
    // Attributes
    public int id;
    private int age;
    public String name;
    public int noS;
    private String gf;

    public String getGF() {
        return this.gf;
    }

    public int setAge(int a) {
        // extra security
        if (age < 100){
            return this.age = a;
        } else {
            return 0;
        }
    }

    // Default constructor // attr. -> garbage value
    public Student() {
        System.out.println("Student Default ctor called");
    }

    // Parameterised ctor
    public Student(int id, int age, String name, int noS) {
        System.out.println("Student Parameterised ctor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.noS = noS;
    }

    // Copy ctor
    public Student(Student srcObj) { //srcObj -> A
        System.out.println("Student Copy ctor called");
        this.id = srcObj.id;
        this.name = srcObj.name;
        this.age = srcObj.age;
        this.noS = srcObj.noS;
    }


    // Method / Behaviour
    public void study(){
        System.out.println(name + " Studing");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }
    private void gfChatting(){
        System.out.println(name + " gfChatting");
    }

    // Encapsulation
    public Student(int id, int age, String name, int noS, String gf) {
        System.out.println("Encapsulation");
        this.id = id;
        this.name = name;
        this.age = age;
        this.noS = noS;
        this.gf = gf;
    }
}
