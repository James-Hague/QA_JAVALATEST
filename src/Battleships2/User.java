package Battleships2;

import java.util.Scanner;

public class User extends BattleshipGame {

    public static void userFire (String[][] board, int hits, int missiles)




    {
        Scanner input = new Scanner(System.in);


        int row,col;
        System.out.println("Select what row you would like to fire on");
        row = input.nextInt();
        while (row > 7 || row < 0) // error checking weather is inside row
        {
            System.out.println(" Enter a valid row (0 -> 7");
        }
        System.out.println("Select what columm you would like to fire on");
        col = input.nextInt();
        while (col > 7 || col < 0) // error checking weather is inside col
        {
            System.out.println(" Enter a valid row (0 -> 7");
        }
        if (board[row][col].equals("S"))
        {
            System.out.println("----HIT----");
                    board[row][col] = "@";
                    hits ++;
                    missiles --;

        }
        else
        {
            System.out.println("---MISS---");
                   board[row][col] = "X";
                   missiles --;
        }
    }



}
