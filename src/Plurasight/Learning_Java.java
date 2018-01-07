package Plurasight;

public class Learning_Java {

    public static void main(String[] arg) {

        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'd';

        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd') { // use blocks to make code more readable even though not always necessary {}
            // quick way
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
        }
        // slow way
           // if (val2 != 0.0d)
            //   result = val1 / val2;
            //    else
            //result = 0.0d;

        else if (opCode == 'm')
            result = val1 * val2;
        else { // if does not match previous aka invalid do this
            System.out.println("Error bad opCode value"); // error checking
            result = 0.0d;
        }

        System.out.println(result);

        // *********RUN STUFF*********

        Loops.whileLoops(); // run loops
        Loops.doWhileLoop(); // run do wile loop
        Loops.forLoop();// run for loop




    }
}
