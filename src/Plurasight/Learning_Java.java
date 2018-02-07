package Plurasight;

public class Learning_Java {

    public static void main(String[] arg) {

        double[] leftVals = {100.0d, 35.0d, 56.0d, 124.0d};
        double[] rightVals = {20.0d, 12.0d, 10.0d, 4.0d, 3.0d};
        char[] opCodes = {'D', 'F', 'L', 'M'};
        double[] results = new double[opCodes.length]; // length is 4

        //double val1 = 100.0d;
        //double val2 = 50.0d;
        //double result;
        //char opCode = 'd';
        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {

                case 'D':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 'F':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'L':// use blocks to make code more readable even though not always necessary {}
                    // quick way
                    results[i] = leftVals[i] != 0.0d ? rightVals[i] / leftVals[i] : 0.0d;
                    break;

                // : checks weather the expression is true or false and assigns the true value to the variable
                // eg variable x = (expression) ? value if true : value if false

                // slow way
                // if (val2 != 0.0d)
                //   result = val1 / val2;
                //    else
                //result = 0.0d;

                case 'M':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                default:  // if does not match previous aka invalid do this
                    System.out.println("Error bad opCode value"); // error checking
                    results[i] = 0.0d;
                    break;
            }

        }
        for (double theResuslt : results) {
            System.out.print("Result = ");
            System.out.println(theResuslt);
        }

        // *********RUN STUFF*********
        Loops.whileLoops(); // run loops
        Loops.doWhileLoop(); // run do wile loop
        Loops.forLoop();// run for loop
        // Arrays
        Arrays.setTheVals(); // run float array
        Loops.forEachLoop();
        // Switch
        Switch.mySwitch();


    }


}

