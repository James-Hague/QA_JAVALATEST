package BattleShips;

import java.util.HashMap;

public class Map {





    int[][] positions = new int [5][5];

    public void refreshMap(sh player) {
        for(int y =0; y < 5; y++) {
            for(int x =0; x <5; x++) {
                [x][y] = 0;
            }
        }
        positions[player.getX()][player.getY()] = 1;
        drawMap();
    }


    int[][] gridSize = new int [3][3];

    public void drawMap() {
        System.out.println();
        for (int x =0; x <gridSize.length; x++){
            for(int y=0; y<gridSize.length; y++)
                System.out.print(gridSize[x][y]); // x and y other way round
            System.out.println(" ");


        }

        // store array of sea positions



    }






}
