package Plurasight;

public class Loops {

    public static void whileLoops() {


        int kVal = 5;
        int factorial = 1;

        while (kVal > 1) {// condition
            // statment
            factorial *= kVal;
            kVal -= 1; // -1 from kval each pass
            System.out.println(factorial); // print each iteration
        }

    }

    public static void doWhileLoop() {
        // do while loop checks at the end of the loop
        int iVal = 5;
        int count = 1;
        String cnt = "Loop Count =";

        do {
            System.out.println("doWhileLoop");
            System.out.println(cnt + count++); // added to count each loop
            System.out.println(iVal);
            System.out.println(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100); // do this wile iVal < 100

    }


    public static void forLoop() {

        // for (initialize; condition; update)
         // statement;

        for (int iVal = 1; iVal < 100; iVal *= 2) {
            System.out.println(iVal);

        }



    }


}












