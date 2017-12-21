package Battleships2;

import java.util.Random;
import java.util.Scanner;


public class BattleshipGame extends  Ship {



        // run things
    public static void main(String[] arg) {
        // generate 8x8 board
        String[][] board = new String[8][8];

        Scanner imput = new Scanner(System.in);

        int numOfGuess= 0;
        boolean isAlive = true;









        BattleShipMap.createBoard(board);


        createRandomShip(board, 3);
        createRandomShip(board, 4);
        createRandomShip(board, 2);

        BattleShipMap.showBoard(board);







    }


}
