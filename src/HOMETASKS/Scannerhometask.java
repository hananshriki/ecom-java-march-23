package HOMETASKS;

import java.util.Scanner;

public class Scannerhometask {
    public static void main(String[] args) {

        // Type name = new Type(...)
        Scanner input = new Scanner(System.in);
        System.out.println("what is your first name?");
  String myFirstName  = input.nextLine();
        System.out.println("myFirstName =  " + myFirstName);


        System.out.println("what is your Lastname?");
       String myLastName = input.nextLine();
        System.out.println("mylastname = " + myLastName);


        System.out.println("what is your city?");
    String MyCity = input.nextLine();
        System.out.println("MyCity = " + MyCity);


        System.out.println("what is your Average Grade?");
    double myAverage = input.nextDouble();
        System.out.println("myAverage = " + myAverage);


        System.out.println("what is your Age?");
    int myAge = input.nextInt();
        System.out.println("myAge = " + myAge);


    }
}

