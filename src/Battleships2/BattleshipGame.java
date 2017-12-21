package Battleships2;

import java.util.Random;
import java.util.Scanner;


public class BattleshipGame extends  Ship {

    public static void createBoard(String[][] board) {
        // how board is made
        for (int r = 0; r < board.length; r++) {

            {
                for (int c = 0; c < board[0].length; c++) {
                    {
                        board[r][c] = "~";
                    }
                }
            }
        }
    }

    // SHOW BOARD
    public static void showBoard(String[][] board) {

        for (int r = 0; r < board.length; r++)

        {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(" " + board[r][c]); // print board
                //System.out.print("");
            }

            System.out.println(" ");
        }
    }




    public static void createRandomShip(String[][] board, int size) {


        if (Math.random() < 0.5)
        {
            // horizintal
            // multiply buy 5 + 2
            int col = (int) (Math.random() * 5) + 2;
            int row = (int) (Math.random() * board.length);

            for (int i = 0; i < size; i++)
            {
                board[row][col + i] = "S";

            }


        }
        else
        {
            // vertical
            // multiply buy 5 + 2
            int row = (int) (Math.random() * 5) + 2;
            int col = (int) (Math.random() * board.length);

            for (int i = 0; i < size; i++)
            {
                board[row + i][col] = "S";
            }
        }
    }









        // run things
    public static void main(String[] arg) {
        // generate 8x8 board
        String[][] board = new String[8][8];


        createBoard(board);
        createRandomShip(board, 3);
        showBoard(board);







    }


}
