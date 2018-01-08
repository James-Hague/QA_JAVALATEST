package Plurasight;

public class Switch {

    public static void mySwitch()  {

        int iVal = 10;

        switch (iVal % 2) { // test if odd or even

            case 0:
                System.out.println(iVal + " Is Even ");
                break;

            case 1:
                System.out.println(iVal + " Is Odd ");
                break;

            default:
                System.out.println("Opps it broke!!!!!!!!");
                break;
        }
    }



    }
