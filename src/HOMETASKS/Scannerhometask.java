package HOMETASKS;

import java.util.Scanner;

public class Scannerhometask {
    public static void main(String[] args) {

        // Type name = new Type(...)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your first name?");
        String myFirstName = input.nextLine();
        System.out.println("myFirstName =  " + myFirstName);


        System.out.println("what is your last name?");
        String myLastName = input.nextLine();
        System.out.println("myLastName = " + myLastName);


        System.out.println("what is your city?");
        String myCity = input.nextLine();
        System.out.println("myCity = " + myCity);


        System.out.println("what is your average grade?");
        double myAverage = input.nextDouble();
        System.out.println("myAverage = " + myAverage);


        System.out.println("what is your age?");
        int myAge = input.nextInt();
        System.out.println("myAge = " + myAge);


    }
}

