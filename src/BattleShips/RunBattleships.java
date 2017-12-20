package BattleShips;

public class RunBattleships {

    public static void main(String[] args) {
        // create map object
        Map battleShipsMap = new Map();
        // create ship
        Ships newShip = new Ships();
        // ship chunk coardinate
        // scout ship
        newShip.shipSection(3,3);
        newShip.shipSection(3,2);


        // draw map
        battleShipsMap.drawMap();



    }



}
