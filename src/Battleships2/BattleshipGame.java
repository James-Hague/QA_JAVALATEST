package Battleships2;

import java.util.Random;
import java.util.Scanner;


public class BattleshipGame extends  Ship {



        // run things
    public static void main(String[] arg) {
        // generate 8x8 board
        String[][] board = new String[8][8];

        Scanner imput = new Scanner(System.in);






        BattleShipMap.createBoard(board);


        createRandomShip(board, 3);
        createRandomShip(board, 4);
        createRandomShip(board, 2);

        int missiles = 3;
        int hits = 0;
        while (missiles > 0 && hits < 4)
        {
            BattleShipMap.showBoard(board);
            User.userFire(board,hits,missiles);

        }











    }


}
