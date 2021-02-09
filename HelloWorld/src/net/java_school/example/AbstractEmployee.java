package net.java_school.example;

public abstract class AbstractEmployee {
	private String name;
	
	public AbstractEmployee() {}
	
	public AbstractEmployee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void dowork(); 
	
}
