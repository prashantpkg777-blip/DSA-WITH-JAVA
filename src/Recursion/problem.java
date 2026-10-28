package Recursion;

public class problem {

    void printDigits(int n){
        if(n==0){
            return ;
        }

        int digit = n%10;
        n = n/10;

        printDigits(n);

        System.out.println(digit);

    }
    public void main(String[] args) {
        int n=137;
        problem p=new problem();
        p.printDigits(n);
    }
}
