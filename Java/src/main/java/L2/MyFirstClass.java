package L2;// package Huppeldepup;

import java.util.Scanner;
import static java.lang.Math.abs;

public class MyFirstClass {

    /**
     * Deze methode print "Hello" plus de invoer
     * Indien de invoer leeg is wordt "World!" teruggegeven
     * @params args
     */
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Hello " + args[0]);
        }
        else {
            System.out.println("Hello World!");
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = in.nextLine();
        System.out.println("Username is: " + userName);

        int plusTwo = abs(-2);
    }

}