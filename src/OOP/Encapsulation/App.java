package OOP.Encapsulation;

public class App {
    static void main(String[] args) {
       // Default ctor
//        Student A = new Student();
//
//        A.age = 19;
//        A.id = 1;
//        A.name = "Prashant Gautam";
//        A.noS = 6;
//
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.noS);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        // Parameterised ctor
//        Student A = new Student(2,20,"Nishant",3);
//
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.noS);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        // Copy ctor
//        Student B = new Student(A);
//
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.age);
//        System.out.println(A.noS);
//
//        A.bunk();

        // Encapsulation
        Student A =  new Student(2,22,"Prashant",7,"Aarya");

        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.setAge(22));
        System.out.println(A.noS);
        System.out.println(A.getGF());

        A.bunk();
        A.sleep();
        A.study();
//        A.gfChatting();
    }
}
