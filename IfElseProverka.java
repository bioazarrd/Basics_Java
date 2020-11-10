package A_JavaBasic;

import java.util.Scanner;

public class IfElseProverka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String color = "Green";
        if (color.equals("red")) {
            System.out.println("Tomato!");
        }else{
            System.out.println("Banana!");
        }
        System.out.println("Bye!");
    }
}