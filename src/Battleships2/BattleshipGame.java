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








        // 1 create board
        BattleShipMap.createBoard(board);

        // add ships
        createRandomShip(board, 3);
        createRandomShip(board, 4);
        createRandomShip(board, 2);


        // start stuff
        int Missiles = 15;

        wlile



        // call player input

        // delete to hide ships
        BattleShipMap.showBoard(board);









    }


}
