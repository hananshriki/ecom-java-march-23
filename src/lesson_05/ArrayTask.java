package lesson_05;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTask {

    public static void main(String[] args) {

        double summary = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int firstNumber = scanner.nextInt();
        summary += firstNumber;
        System.out.println("Please enter number 2: ");
        int secondNumber = scanner.nextInt();
        summary += secondNumber;
        System.out.println("Please enter number 3: ");
        int thirdNumber = scanner.nextInt();
        summary += thirdNumber;

       ArrayList<Integer>arraylist = new ArrayList<>();
      arraylist.add(firstNumber);
      arraylist.add(secondNumber);
      arraylist.add(thirdNumber);

        int biggestNumber = (arraylist.get(0) > arraylist.get(1)) ?arraylist.get(0) : arraylist.get(1);
        biggestNumber = (arraylist.get(2) > biggestNumber) ? arraylist.get(2) : biggestNumber;

        System.out.println("biggestNumber = " + biggestNumber);
        System.out.println("(summary / 3.0) = " + (summary / 3.0));

    }
}
