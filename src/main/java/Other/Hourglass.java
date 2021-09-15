package nl.Huppeldepup;

import java.util.Scanner;

public class Hourglass {

    private static int safetyStop = 0;

    public static void main(String[] args) {
        new Hourglass().createHourglass();
    }

    public void createHourglass() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");

        try {
            int n = (Integer.valueOf(in.nextLine()));
            if (n % 2 == 0) {
                throw new EvenNumberException();
            }
            String symbol = "*";
            StringBuilder line = new StringBuilder(symbol.repeat(n));
            System.out.println(line);
            for (int i = 1; i < n - 1; i++) {
                if (i < n / 2) {
                    System.out.println(" ".repeat(i) + symbol + " ".repeat((n - 2) - 2 * i) + symbol);
                }
                if (i == n / 2) {
                    System.out.println(" ".repeat(n / 2) + symbol + " ".repeat(n / 2));
                }
                if (i > n / 2) {
                    System.out.println(" ".repeat(n - (i + 1)) + symbol + " ".repeat((n / 2 - (n - (i + 1))) * 2 - 1) + symbol);
                }
            }
            System.out.println(line);
            safetyStop = 0;
        } catch (EvenNumberException | NumberFormatException e) {
            System.out.println("Only odd numbers allowed!");
            safetyStop++;
            if (safetyStop == 3) {
                System.out.println("Strike 3, you're out!");
                System.exit(-1);
            }
            createHourglass();
        }
    }
    private static class EvenNumberException extends Throwable {

    }
}
