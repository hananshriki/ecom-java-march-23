package lesson_03.Classtasks;

import java.util.Scanner;

public class Clocktask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what time it is now? ");

        int wholeTime = scanner.nextInt();

        System.out.println("the current time is:");
        System.out.println((wholeTime / 100) + " : " + (wholeTime % 100));

        int hours = wholeTime / 100;
        int minutes = wholeTime % 100;

        System.out.println("the current time is:");
        System.out.println(hours + " : " + minutes);


    }
}
