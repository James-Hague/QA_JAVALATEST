package GameExercise;
import java.util.Scanner;
// Import scanner object
public class GameMain {
	
		public static void main(String[] args) {
			//creating object
			PlayerPosition player = new PlayerPosition(2,2);
			//creating object
			Map map = new Map();	
			boolean appQuit = false;
			
			map.refreshMap(player);
			Scanner scan = new Scanner(System.in);
			//While a condition is met repeat the content inside
			while (appQuit == false) {
				System.out.println("Enter Direction:");
				String stringInput = scan.nextLine();
				if (stringInput.equals("QUIT")) {
					appQuit = true;
				} else {
					player.Input(stringInput);
					//passing created object to the Map class
					map.refreshMap(player);
				}
			}
        }
}
          
		
      




