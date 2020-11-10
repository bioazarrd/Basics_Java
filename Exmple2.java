package A_JavaBasic;

import java.util.Scanner;

public class Exmple2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    // въведи Pesho два пъти.
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        // true
        System.out.println(a.equals(b));
        // true
        System.out.println(b.equals(a));
        // false
        System.out.println(a == b);
        // true но въведи Pesho и pesho!
        System.out.println(a.equalsIgnoreCase(b));
    }

}
