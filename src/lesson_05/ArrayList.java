package lesson_05;

public class ArrayList {

    public static void main(String[] args) {


        int Array[] = new  int[5];
        Array[0]= 5;



        java.util.ArrayList<Integer> Arraylist = new java.util.ArrayList();
        Arraylist.add(6);
        Arraylist.add(10);
        System.out.println("Arraylist.get(0) " + Arraylist.get(0));
        System.out.println("Arraylist.size() = " + Arraylist.size());

        Arraylist.set(1,50);
        System.out.println("Arraylist.get(1) = " + Arraylist.get(1));
    }
}
