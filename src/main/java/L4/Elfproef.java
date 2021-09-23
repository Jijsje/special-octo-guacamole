import java.util.Scanner;

public class Elfproef { // compileert niet

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNumber = in.nextLine();

        int sum = 0;
        for (int i = 0; i<accountNumber.length(); i++) {
            int digit = Integer.valueOf(accountNumber.substring(i, i+1));
            sum = sum + digit*(9-i);
        }

        System.out.println("Sum = " + sum);

        if (sum%11 == 0) {
            System.out.println("Elfproef geslaagd!");
        }
        else {
            System.out.println("Jammer de bammer");
        }
    }

}
