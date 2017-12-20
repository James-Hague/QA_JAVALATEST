package BattleShips;

import java.util.Scanner;

public class SimpleShipTest extends SimpleShip {

    public static void main(String[] args) {
        // create new ship
        SimpleShip ship = new SimpleShip();
        // ship location
        int[] location = {2, 3, 4};

        ship.setLocation(location);
        // guess number
        String userGuess = "2";
        // call check the guess
        ship.checkGuess(userGuess);
        //player guesses
        int numOfGuess = 0;
        // is ship alive
        boolean isAlive = true;
        // Scanner
        Scanner input = new Scanner(System.in);
        // do this wile alive
        while (isAlive) {
            String result;
            System.out.println("Enter a guess");
            userGuess = input.nextLine();
            result = ship.checkGuess(userGuess);
            // add to number of guesses
            numOfGuess++;
            if (result.equals("Kill")){
                isAlive = false;
            }

        }
        System.out.println("You took " + numOfGuess + "Guesses to sink ship");



    }




}
