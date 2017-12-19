package Exercise2_0;

import java.util.ArrayList;

public class PersonClass {
    // variables
	private String name = "name";
	private String jobTitle = "jobTitle";
	private int age = 0;

	public PersonClass(String name, String jobTitle, int age) { // Constructor of the class
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	} // set int age
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	} // set string job title
	public void setName(String name) {
		this.name = name;
	} // set string name


	// getters and setters

	public String getName() {
		return "Name: " +  name;
	}

	public String getJobTitle() {
		return "Job Title: " +jobTitle;
	}

	public String getAge() {
		return "Age: " + age;
	}

	@Override
	public String toString() {
		return "Exercise2_0.PersonClass [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + "]";
		// String to string takes information from the array
	} 
    
}


