public class Main {

    public static void main(String[] args) {
        // write your code he

        long number = 1234567791111L;
        String numberAsString = "" + number;

        //System.out.print(numberAsString);
        String numberPosition = numberAsString; // num as string is the number
        String numberChars = "";

        //for
        // grab number and add the name of the large number
        switch (numberAsString.length()) {

        }

        if (numberAsString.length() >= 13) {

            // number you want to select then print
            numberChars = numberPosition.substring(0,1);
            System.out.print(numberChars + "  trillion");

        }

        if (numberAsString.length() >= 12) {

            // number you want to select then print
            numberChars = numberPosition.substring(1,4); // number pos
            System.out.print( "  " + numberChars + "  billion");

        }


        if (numberAsString.length() >= 11) {

            // number you want to select then print
            numberChars = numberPosition.substring(4,7); // number pos
            System.out.print( "  " + numberChars + "  Million");

        }


        if (numberAsString.length() >= 9) {

            // number you want to select then print
            numberChars = numberPosition.substring(7,10); // number pos
            System.out.print( "  " + numberChars + "  Thousands");

        }

        if (numberAsString.length() >= 8) {

            // number you want to select then print
            numberChars = numberPosition.substring(10,13); // number pos
            System.out.print( "  " + numberChars + "  ");

        }










    }










    }










