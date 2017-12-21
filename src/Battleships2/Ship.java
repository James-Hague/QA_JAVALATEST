package Battleships2;

public class Ship {


    public static void createRandomShip(String[][] board, int size) {
        boolean check = true;
        int col = 0;
        int row = 0;
        if (Math.random() < 0.5) {
            // horizintal
            while (check) {


                // multiply buy 5 + 2
                col = (int) (Math.random() * 5) + 2;
                row = (int) (Math.random() * board.length);
                // check is valid

                if (col + size < board.length) {
                    check = false; // repeat untill true
                }


            }
            for (int i = 0; i < size; i++) {
                board[row][col + i] = "S";

            }
            // restraint

        } else {
            while (check) {
                // vertical
                // multiply buy 5 + 2
                row = (int) (Math.random() * 5) + 2;
                col = (int) (Math.random() * board.length);


                    if (row + size < board.length) {
                        check = false; // repeat untill true
                    }
                }
                // reject imput try again
                for (int i = 0; i < size; i++) {
                    board[row + i][col] = "S";
                }


            }
        }


    }





