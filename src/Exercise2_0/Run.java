package Exercise2_0;

public class Run {

	public static void main(String[] args) {
		
		Exercises exerciseVariable = new Exercises();  // exerciseVariable new class object
		
		exerciseVariable.printHello("hello world1");
		// printing return value of my String returnHelloWorld
		System.out.println(exerciseVariable.returnHelloWorld()); // 4

		     //result of numbers added numbersAdded
		int numbersAdded = exerciseVariable.AddingNums(34, 55); // defining what numbers are being added
		System.out.println(numbersAdded); // print result numbersAdded

		//6
		int conBooResult = exerciseVariable.Conditionals(34, 55, false); // if true add if false multiply
		System.out.println(conBooResult); // print result conBooResult

		//CONDITIONALS 1
		int ifIsZeroResult = exerciseVariable.checkIsZero(1, 0); // dont set boolean
		System.out.println(ifIsZeroResult);

		//CONDITIONALS 2
		ifIsZeroResult = exerciseVariable.checkIsZero(1, 2); // dont set boolean
		System.out.println(ifIsZeroResult);
	    // stored (temporary variables eg. like RAM) numbersAdded, conBooResult, ifIsZeroResult
	    
		exerciseVariable.Iteration(); // call iteration

		exerciseVariable.Arrays();
		// exerciseVariable (my class as an object) . ( . calls anything from that class as long as its public)
	    // Arrays (is my method from that class)
		exerciseVariable.ArraysIteration();// calling arrays iteration

		exerciseVariable.arraysLoop();


		// blackjhack calling methodddddddd

		int t = exerciseVariable.Blackjack(7,11); // passes cards to my method
		System.out.println("Highest Value: " + t); // receive and print the returned number.
		t =  exerciseVariable.Blackjack(13,12);
		System.out.println("Highest Value: " + t);
		t =  exerciseVariable.Blackjack(21,22);
		System.out.println("Highest Value: " + t);
		t =  exerciseVariable.Blackjack(22,22);
		System.out.println("Highest Value: " + t);


		// unique sum

		// call method here and add ints
		int a = exerciseVariable.uniqueSum(23, 42, 89);
		System.out.print("result  " + a);
		a = exerciseVariable.uniqueSum(23, 45, 23);
		System.out.print("result  " + a);



		// IS HOTT

		boolean c = exerciseVariable.tooHot(75, true);
		System.out.print("IT SSUMMER" + c);

	
	}

}
