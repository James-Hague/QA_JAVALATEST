package Battleships2;

public class BattleShipMap {



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

}
