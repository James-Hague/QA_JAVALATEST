
public class PersonClass {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public PersonClass(String name, String jobTitle, int age) { // Constructor because no return type
		super();
		this.name = name;
		this.jobTitle = jobTitle;
		this.age = age;
	}
	// 

	
	private String name = "name";
	private String jobTitle = "jobTitle";
    private int age = 0;
	@Override
	public String toString() {
		return "PersonClass [name=" + name + ", jobTitle=" + jobTitle + ", age=" + age + "]";
		// String to string takes information from the array
		
		
		
		
	} 
    
}


