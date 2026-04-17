public class BasicMaths {

    static void printDigits(int num){
        while (num != 0){
            int digit = num%10;
            System.out.println(digit);
            num = num / 10;
        }
    }
    static int countDigits(int num){
        int count =0;
        while (num != 0){
            int digit = num%10;
            count++;
            num = num / 10;
        }
        return count;
    }
    static int sumOfDigits(int num){
        int sum = 0;
        while (num != 0){
            int digit = num%10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }
    static int reverseNum(int num){
        int revNum = 0;
        while (num != 0){
            int digit = num%10;
            revNum = revNum*10 +digit;
            num = num / 10;
        }
        return revNum;
    }
    static void isPalindrome(int num){
        int originalNum = num;
        int reverseNum = reverseNum(num);

        if (originalNum == reverseNum){
            System.out.println("It is a Palindrome.");
        }
        else {
            System.out.println("It is not a Palindrome.");
        }
    }
    static boolean isPrimeOrNot(int num){
        for (int i =2; i <= Math.sqrt(num);i++){
            if (num % i == 0){
//                System.out.println("Not Prime");
                return false;
            }
        }
//        System.out.println("Yes Prime.");
        return true;
    }
    static int getGCD(int a, int b){
        // gcd(a,b) = gcd(b,a%b);
        while (b != 0){
            int oldb = b;
            b = a%b;
            a = oldb;
        }
        return a;
    }
    static int getLCM(int a, int b){
        int lcm = (a*b)/getGCD(a,b);
        return lcm;
    }
    static boolean isArmstrongNum(int num){
        int sum =0;
        int orignialNum = num;

        while (num !=0){
            int digit = num % 10;
            sum = sum + digit*digit*digit;
            num = num / 10;
        }
        if (sum == orignialNum){
            return true;
        }
        else {
            return false;
        }
    }
    static void allPrime(int num){
        for (int i =2; i <= num;i++){
            boolean isPrime = isPrimeOrNot(i);
            if (isPrime == true){
                System.out.println(i);
            }
        }
    }
    static void main() {
//        int num = 1777 ;
//
//        printDigits(num);
//        System.out.println("Number of digits: "+ countDigits(num));
//        System.out.println("Sum of Digits: "+ sumOfDigits(num));
//        System.out.println("Reverse of number is "+ reverseNum(num));
//        isPalindrome(num);
//        isPrimeOrNot(num);
//
//
//        System.out.println(getGCD(52,56));
//        System.out.println(getLCM(12,9));
        int num = 153;
        System.out.println(isArmstrongNum(num));
        allPrime(100);
    }
}
