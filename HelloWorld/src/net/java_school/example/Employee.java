package net.java_school.example;

public class Employee {

	private String name;
	private String jobTitle;
	
	public Employee() {} 	/* default constructor */

	public Employee(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;
	}
	
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("|");
		sb.append(jobTitle);
		
		return sb.toString();
	}
}
