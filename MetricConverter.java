package A_JavaBasic;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine()); // always CM
        String inn = scanner.nextLine();
        String out = scanner.nextLine();

        if ("mm".equals(inn)) {
            number /= 10;
        } else if ("m".equals(inn)) {
            number *= 100;
        }

        if ("mm".equals(out)) {
            number *= 10;
        } else if ("m".equals(out)) {
            number /= 100;
        }
        System.out.printf("%.3f", number);
    }
}