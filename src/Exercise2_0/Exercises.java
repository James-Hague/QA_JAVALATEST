package Exercise2_0;
// ctr shift alt l    reformat everything

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Exercises {

    // 1 and 2   String is the parameter
    void printHello(String text) { // information stored in string is referred to by "text"
        System.out.println(text); // prints the information named as text taken from the string in ex0
    }

    public String returnHelloWorld() { // 4
        // return string "Hello World"
        return "Hello World2";

    }

    // parameters
    public int AddingNums(int Value1, int Value2) { // 5
        // method for adding the numbers then return to add the
        //actual numbers in the main class eg.55
        return Value1 + Value2;
    }

    // parameters
    public int Conditionals(int Con1, int Con2, boolean ConBoo) {

        if (ConBoo == true) // no ; after a condition if statment is conditionnn
        {
            return (Con1 + Con2);         //if conboo true do this
        } else if (ConBoo == false) {
            return (Con1 * Con2);       //if conboo false do this
        }
        return 0; // default if if or else are wrong somehow?????
    }

    //CONDITIONALS 2
    public int checkIsZero(int Num1, int Num2) { // just  no boolean being used

        if (Num2 == 0) // no ; after a condition if statment is conditionnn
        {
            return (Num1);         //if true do this
        } else if (Num1 == 0) {
            return (Num2);       //if  false do this
        } else {
            return Num1 + Num2;
        }


    }

    public void Iteration() {

        // int i =1 starting number value
        // i <= 10; how many times you want to count it
        // i ++ how many it goes up by

        for (int i = 1; i <= 10; i++) { // no ; on a for loop

            int iterationNumber = checkIsZero(i, 2);
            System.out.print(iterationNumber + " ");
        } // print does same line doesnt make new line println makes new line
        System.out.println();


    }
    // Create an array that will hold 10 integer values,
    //int[] myArray = new int[10]; // square brackets mean array
    //  populate the array with values


    // simple array populated with 10 values ( note use this way in future)
    int[] arrayVariables = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    public void Arrays() { // task 9
        // then call and output the result of your method from Conditionals passing values
        // that are stored in the array as arguments to the method.
        // my method/Function is Arrays
        // index of an array always starts at zero
        for (int t = 0; t < arrayVariables.length; t++) { // t is the variable in my for loop // .length  is the length of the array
            int methodResult = checkIsZero(1, arrayVariables[t]);// num one is a random number // arrayVariables[t]) calling value from the array aka t
            System.out.print(methodResult + " ");
        }
        System.out.println();
    }

    public void ArraysIteration() {
        for (int t = 0; t < arrayVariables.length; t++) { // t is the variable in my for loop // .length  is the length of the array
            System.out.print(arrayVariables[t] + " "); // print my arrayVariables [t] witch is all variables
        }
        System.out.println();
    }

    int[] arrays2 = new int[10];
    // Create a for loop that populates an integer array with values, outputting them at
    //each iteration. Then create another loop that iterates through the array, changing
    // the values at each point to equal itself times 10, outputting them at each iteration.

    public void arraysLoop() {
        for (int t = 0; t < arrays2.length; t++) { // t is the variable in my for loop // .length  is the length of the array
            arrays2[t] = t; // arrays2 now will equal arrays[0,1,2,3,4,5,6,7,8,9]
            System.out.print(t + " ");
        }
        System.out.println();  // make new line
        for (int t = 0; t < arrays2.length; t++) {
            System.out.print(arrays2[t] * 10 + " "); // print out arrays x10
        }
        System.out.println(); // make new line

    }

    public int Blackjack(int cardTotal1, int cardTotal2) {

        if (cardTotal1 <= 21 && cardTotal2 <= 21) { // if carTotal 1 is less than or equal to 21 and and cardTotal2 also is
            if (cardTotal1 > cardTotal2) { // check what one is greater
                return cardTotal1; // return variable
            } else // or
            {
                return cardTotal2; // return variable
            }
        } else if (cardTotal1 <= 21 && cardTotal2 > 21) //if cardTotal 1 is less than 21 and cardTotal2 is over 21
        {
            return cardTotal1; //return value
        } else if (cardTotal2 <= 21 && cardTotal1 > 21) { //if cardTotal 2 is less than 21 and cardTotal1 is over 21 (&& check if both conditions are true)
            return cardTotal2;
        } else { //because all options are covered if both are over 21 do this
            return 0;
        }
    }

    public int uniqueSum(int sumNum1, int sumNum2, int sumNum3) {

        // KEEP IT SOMPLE

        if (sumNum1 == sumNum2) { // check
            return sumNum3;
        }
        if (sumNum2 == sumNum3) {
            return sumNum1;
        }
        if (sumNum3 == sumNum1) {
            return sumNum2;
        } else {
            return sumNum1 + sumNum2 + sumNum3;
        }


        // Given 3 integer values, return their sum. If one value is the same as another value,
        //       they do not count towards the sum. Aka only return the sum of unique numbers
        // given.
    }

    public boolean tooHot(int temperature, boolean isSummer) {

        if (isSummer == true) {
            if (temperature < 100 && temperature > 60) {
            }
            if (isSummer == false) {
                if (temperature < 90 && temperature > 60) {

                    return false;
                }

            }
        }
    }


















