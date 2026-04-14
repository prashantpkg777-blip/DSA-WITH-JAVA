public class method {
    static void print2KaTable() {
        // Declaration/ Definition
        for (int i=1; i<= 10; i++){
            System.out.println("-> "+ 2*i);
        }
    }
    static void sumOf2Number(int x, int y){
        System.out.println("Sum: "+ (x+y));
    }
    static int multiple(int x,int y) {
        int multi = x*y;
        return multi;
    }
    static void main() {
        System.out.println("Print 2 ka Table");
        // Method Call/Invoke
        print2KaTable();

        System.out.println("End");

        sumOf2Number(55,99);

        System.out.println("Multiply: "+ multiple(5,9));
    }
}
