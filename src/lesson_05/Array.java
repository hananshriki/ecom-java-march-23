package lesson_05;

public class Array {
    public static void main(String[] args) {

        int numbersArray[]= new int[10];
        System.out.println("numbersArray[0] = " + numbersArray[0]);
        numbersArray[0] = 15;
        System.out.println("numbersArray[0] = " + numbersArray[0]);
        System.out.println("numbersArray[1] = " + numbersArray[0]);
        numbersArray[1] = 20;
        System.out.println("numbersArray[1] = " + numbersArray[1]);
        System.out.println("numbersArray.length = " + numbersArray.length);

        System.out.println("numbersArray.length = " + numbersArray.length);
        int numbersOfArray2[] = {5,10,15,20};
        System.out.println(numbersOfArray2[0]);

        System.out.println("numbersOfArray2.length = " + numbersOfArray2.length);


    }
}
