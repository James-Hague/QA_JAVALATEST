package Exercise2_0;


import java.util.ArrayList;

public class PersonSearch {

    public void SearchName(String name,ArrayList<PersonClass> listOfPeople){

        for (int i = 0; i < listOfPeople.size(); i++) { // add one untill you get to the end of arraylist
            if (listOfPeople.get(i).getName().equals("Name: " + name)) { // if the index of the array .getName (the Class) .equals (because its a string)
                System.out.println("" + listOfPeople.get(i).getName() + " " + listOfPeople.get(i).getJobTitle() + " " + listOfPeople.get(i).getAge()); // print name job and age
            }
        }

    }
}
