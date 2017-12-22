package Battleships2;

import java.util.Scanner;

public class Player extends  BattleShipMap {


    public static void userFire(String[][] board, Scanner input) {

        // tell where imput is
        int row, col;

        System.out.println(" Select Row to fire");
        row = input.nextInt();
        // error checking
        while (row > 7 || row < 0) {
            System.out.println(" Enter a valid row 1-7");
            row = input.nextInt();
        }
        System.out.println(" Select Column to fire");
        col = input.nextInt();
        // error checking
        while (col > 7 || row < 0) {
            System.out.println(" Enter a valid Column 1-7");
            col = input.nextInt();

        }
        if (board[col][row].equals("S")) { // if there is a ship there
            System.out.println("~~~~HIT~~~~");
            board[col][row] = "H";
        }
          else
              {
                System.out.println("~~~~Miss~~~~");
                board[col][row] = "X";
            }

            // check weather it hits a ship
            //add change hit or miss
            // redraw the map

        }

    }






