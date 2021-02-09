package net.java_school.example;

public class Employee extends AbstractEmployee {

	private String jobTitle;
	
	public Employee() {} 	/* default constructor */

	public Employee(String name, String jobTitle) {
		super(name);
		this.jobTitle = jobTitle;
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
		sb.append(getName());
		sb.append("|");
		sb.append(jobTitle);
		
		return sb.toString();
	}

	@Override
	public void dowork() {
		System.out.println("do work!");
	}
}
