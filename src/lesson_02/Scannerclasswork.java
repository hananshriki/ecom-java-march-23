package lesson_02;

import java.util.Scanner;

public class Scannerclasswork {
    public static void main(String[] args) {

        // Type name = new Type(...)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String myName = input.nextLine();
        System.out.println("myName = " + myName);

        System.out.println("what is your age?");
        int myAge = input.nextInt();
        System.out.println("myAge = " + myAge);

        System.out.println("what is your average grade?");
        double myAverage = input.nextDouble();
        System.out.println("myAverage = " + myAverage);



    }
}
