package Basics;

public class Strings {
    static void main() {
//         String firstName = "Prashant";
//         String lastName = "Gautam";
//
//        System.out.println(firstName+" "+lastName);
//
//        System.out.println(firstName.length());
//        System.out.println(firstName.charAt(0));
//        // strings are immutable
//        lastName = "Kumar";
//        System.out.println(lastName); //its make new string
//
//        // compare
//        String str1 = "Love";
//        String str2 = "LOVE";
//
//        System.out.println(str1 == str2); //false
//        System.out.println(str1.equals(str2)); //false
//        System.out.println(str1.equalsIgnoreCase(str2)); // true
//
//        // Input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide a String content: ");
//        String strWord = sc.next();
//        String strSentence = sc.nextLine();
//        System.out.println(strWord +" and "+ strSentence);
//
//        String str = "  ";
//        // empty = length - 0
//        // blank = empty or only space
//        System.out.println(str.isEmpty()); // false
//        System.out.println(str.isBlank()); // true
//
//        String name = "   Love   ";
//        System.out.println(name);
//        System.out.println(name.length());
//        name = name.trim();
//        System.out.println(name);
//        System.out.println(name.length());
//
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//
//        String sen = "My name is Prashant Gautam";
//        System.out.println(sen.substring(3,7)); // name
//        System.out.println(sen.contains("Prashant")); // true
//
//        int num = 567;
//        String change = String.valueOf(num);
//        System.out.println(num + 1); //568
//        System.out.println(change + 1); //5671

        String name = "Shri Prashant Kumar Gautam";
        System.out.println(name.startsWith("Shri"));
        System.out.println(name.endsWith("Gautam"));

        // char array

        char[] crr = name.toCharArray();

        for (char ch: crr){
            System.out.println("Value of char: "+ch);
        }

        //split
        String word[] = name.split(" ");

        for (String str: word){
            System.out.println(str);
        }

        // replace
        String str = "Pizzazzz";
        str = str.replace("z","s");
        System.out.println(str);
    }
}
