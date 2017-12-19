package GameExercise;
public class PlayerPosition {
	
	int y;
	int x;
	
	public PlayerPosition(int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	private void moveNorth() {
		if (x > 0 == true) {
			x -= 1;
		} else {
			System.out.println("Can't go further North");
		}
	}

	private void moveSouth() {
		if (x < 4 == true) {
			x += 1;
		} else {
			System.out.println("Can't go further South");
		}
	}
	
	private void moveEast() {
		if (y < 4 == true) {
			this.y += 1;
		} else {
			System.out.println("Can't go further East");
		}
	}
	
	private void moveWest() {
		if (y > 0 == true) {
			this.y -= 1;
		} else {
			System.out.println("Can't go further West");
		}
	}
	

    public void Input(String thePlayersInput) {
    	if (thePlayersInput.equals("NORTH")) {
    		moveNorth();
    	}
    	else if (thePlayersInput.equals("SOUTH")) {
    		moveSouth();
    	}
    	else if (thePlayersInput.equals("EAST")) {
    		moveEast();
    	}
    	else if (thePlayersInput.equals("WEST")) {
    		moveWest();
    	}
    	else {
    		System.out.println(thePlayersInput + " Is An Unknown Command");
    	}
    }
}
