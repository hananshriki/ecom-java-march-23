package lesson_03;

public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 10;

        System.out.println("a = " +a);

        // a=a+1;
        // a+=1;
        //a++ = + a++  = 10 // postfix
        // a+1= 11
        System.out.println("a++ = "  + ++a); // prefix
        System.out.println("a =" +a);

        System.out.println("a++ =" + ++a);
        System.out.println("a =" + a);



        // a=a-1;
        // a-=1;
        System.out.println("a-- = "  + --a); // prefix
        System.out.println("a =" +a);

        System.out.println("a-- =" + --a);
        System.out.println("a =" + a);






    }
}
