package GameExercise;

public class Map {
	
	int[][] positions = new int [5][5];
	
	public void refreshMap(PlayerPosition player) {
		for(int y =0; y < 5; y++) {
			for(int x =0; x <5; x++) {
				positions[x][y] = 0;
			}
		}
		positions[player.getX()][player.getY()] = 1;
		drawMap();
	}
	
	private void drawMap() {
		System.out.println();
		for (int x =0; x <5; x++){
			for(int y=0; y<5; y++)
				System.out.print(positions[x][y]); // x and y other way round
			System.out.println(" ");
		}
	}

}
