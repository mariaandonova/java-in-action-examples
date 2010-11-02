package jia.begins.examples.basics;

import java.util.Scanner;

/**
 * @author Bozhidar Batsov
 */
public class IOTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = in.next();

        System.out.printf("Welcome back, Lord %s, Master of Java and Ruler of the Universe!%n", name);

        System.out.print("Enter a number, my liege: ");
        int number = in.nextInt();

        System.out.printf("Lord %s, the sacred number you entered is %d!%n", name, number);
    }
}
