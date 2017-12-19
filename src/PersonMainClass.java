
public class PersonMainClass {
	
	public static void main(String[] args) {
		
		PersonManager PM = new PersonManager(); // create person manager object PM
		
		PersonClass Per1 = new PersonClass("Steve", "IT Guy", 55); // Person Information
		PersonClass Per2 = new PersonClass("Dave", "Potter", 65); // Person Information
		PersonClass Per3 = new PersonClass("Jess", "Pilot", 40); // Person Information
		PersonClass Per4 = new PersonClass("Charlie", "Blacksmith", 20); // Person Information
		PM.PersonArray.add(Per1); // PM = PersonManager .PersonArray send to person array .add(Person); add person 
		PM.PersonArray.add(Per2);
		PM.PersonArray.add(Per3);
		PM.PersonArray.add(Per4);
		//PM.PersonArray
		
		
		System.out.println(PM.PersonArray); // Print Person Information
		
		
	
		
	}
	
	

}
