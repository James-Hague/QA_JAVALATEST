package BattleShips;

public class SimpleShip {

    int [] location;

    private int numOfHits;

    public void setLocation(int [] loc) {
        location = loc;

    }
    public String checkGuess(String userGuess) {

        String result = "Miss";

        int guess = Integer.parseInt(userGuess);

        for (int loc : location) {

            if (guess == loc) {

               numOfHits++;

               result = numOfHits == location.length ? "Kill" : "Hit";
               break;
            }
        }
        // PRINT RESULT
        System.out.println(result);
        return result;
    }


}
