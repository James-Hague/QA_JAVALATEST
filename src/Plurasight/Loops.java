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
            System.out.println("DO WHILE LOOP");
            System.out.println(cnt + count++ + "  " + iVal + " * 2 = " );
            iVal *= 2; // whats happening
            System.out.println(iVal);
        } while (iVal < 100); // do this wile iVal < 100 (condition at the end)

    }


    public static void forLoop() {

        // for (initialize; condition; update)
         // statement;
        int count = 1;

        for (int iVal = 1; iVal < 100; iVal *= 2) {
            System.out.println(" iVal Value " + iVal + "  LoopCount  " + count++); //added a loop count for each loop of the for loop

        }



    }


}












