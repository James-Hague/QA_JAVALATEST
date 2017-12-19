
public class Exercise1 {

//	public static void main(String[] args) {
//
//		// TODO Auto-generated method stub
//
//		Exercise1 ex = new Exercise1();
//
//		ex.ex1(); // method example
//		ex.ex2();
//		ex.ex3();
//		System.out.println(ex.ex4(2, 3, false)); // refers to A + B in ex4 and uses the numbers entered as value
//		ex.printHello(ex.ex0()); // draws string value eg, "Hello World"
//		ex.itteration();
//
//	}

	private void itteration() {

		for (int i = 0; i < 10; i++) { // int I = 0; i < 10; can to to a max of to I++) add 1

			// System.out.println(check);

			System.out.println(ex4(i, i + 1, true)); // add 1 if boolean is true each time to a multiple of 10

		}

		// TODO Auto-generated method stub

	}

	private int ex4(int A, int B, boolean Check) { // Method, include A and B Values and Boolean

		if (A == 0) {
			return B;

		} else if (B == 0) {

			return A;
		}

		else if (Check) {
			return (A + B);

		}

		if (Check)

		{ // if check value is... make action

			return A + B;

		} else {

			return A * B;

		}

	}

	void printHello(String text) { // information stored in string is referred to by "text"
		System.out.println(text); // prints the information named as text taken from the string in ex0
	}

	private void ex3() {
		// TODO Auto-generated method stub
		System.out.println("Hellow World1");
		return;
	}

	private void ex2() {
		// TODO Auto-generated method stub
		System.out.println("Hellow World2");
	}

	private void ex1() {
		// TODO Auto-generated method stub
		String greeting = "Hellow Wide World3";
		System.out.println(greeting);
	}

	private String ex0() {
		// TODO Auto-generated method stub
		String greeting = "Hellow Wide World4 value of this refferd to as tex by the string";
		return greeting; // returns greeting so can be used by text
	}

}
