package lesson_02;

import java.util.Scanner;

public class Scannerwork {
    public static void main(String[] args) {
        // type name = value
        int age = 100;

        // Type name = new Type(...)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name? ");

       String myname = input.nextLine();
        System.out.println("myname = " + myname);

        System.out.println("what is your age? ");
        int myAge = input.nextInt();
        System.out.println("what is your average grade? ");
        double myAverage = input.nextDouble();


        System.out.println("myAge = " + myAge);
        System.out.println("myAverage = " + myAverage);

    }
}
