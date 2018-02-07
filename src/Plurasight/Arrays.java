package Plurasight;

public class Arrays {

    public static void setTheVals() {

    float[] theVals = new float[5]; // new array with 5 float values
        System.out.println("SET THE VALS");

    theVals[0] = 10.0f;
    theVals[1] = 20.0f;
    theVals[2] = 15.0f;
    theVals[3] = 55.0f;
    theVals[4] = 95.0f;


        float sum = 0.0f;
        // loop through until "i" is the length of the array
    for (int i = 0; i < theVals.length; i ++) // loop through the vals ++1

        sum += theVals[i];


    System.out.println(sum);


    }


}
