package Exercise2_0;

import java.util.ArrayList;

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

        int t = exerciseVariable.Blackjack(7, 11); // passes cards to my method
        System.out.println("Highest Value: " + t); // receive and print the returned number.
        t = exerciseVariable.Blackjack(13, 12);
        System.out.println("Highest Value: " + t);
        t = exerciseVariable.Blackjack(21, 22);
        System.out.println("Highest Value: " + t);
        t = exerciseVariable.Blackjack(22, 22);
        System.out.println("Highest Value: " + t);


        // unique sum

        // call method here and add ints
        int a = exerciseVariable.uniqueSum(23, 42, 89);
        System.out.println("result  " + a);
        a = exerciseVariable.uniqueSum(23, 45, 23);
        System.out.println("result  " + a);


        // IS HOTT

        boolean c = exerciseVariable.tooHot(75, true);
        System.out.println("its not to hot " + c);
        c = exerciseVariable.tooHot(95, false);
        System.out.println("Mans too Hott " + c);

        // PEOPLE

        // Opjects in array
        // Create some example objects with this class.
        PersonClass person1 = new PersonClass("James Hague", "Trainee", 24);
        PersonClass person2 = new PersonClass("Bob Thebuilder", "Builder", 27);
        PersonClass person3 = new PersonClass("James Blunt", "Singer", 34);
        PersonClass person4 = new PersonClass("David Cameron", "Prankster", 55);
        // Array list
        ArrayList<PersonClass> personArray = new ArrayList<PersonClass>();
        // add to array
        personArray.add(person1);
        personArray.add(person2);
        personArray.add(person3);
        personArray.add(person4);

        //Standard for loop
        for (int i = 0; i < personArray.size(); i++) {
            System.out.println("" + personArray.get(i).getName() + " " + personArray.get(i).getJobTitle() + " " + personArray.get(i).getAge()); // print everything in array
        }

        //Enhanced for loop
        for (PersonClass person : personArray) //for each PersonClass in the personArray stored in person
        {
            System.out.println(person.getName() + " " + person.getJobTitle() + " " + person.getAge());
        }

        // new search
        PersonSearch search = new PersonSearch();
        // search for person
        search.SearchName("James Hague", personArray);


        // Switch and case ( use these)
        String temp = "James";

        switch (temp) { // temp is the value you pass into it and is checked against case
            case "damien" : {
                break;
            }
            case "James":{
                System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"); // if case == this do this like an if statment
                break; // always include a break or will run all the code
            }
            default: { // for good practice put a default in
                System.out.println("Nothing");
                break;
            }
        }




    }


}
