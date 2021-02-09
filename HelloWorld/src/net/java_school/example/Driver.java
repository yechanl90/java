package net.java_school.example;

public class Driver extends Employee implements Drivable {
	private String carNo;

	public String getCarNo() {
		return carNo;
	}

	
	public Driver(String name, String jobTitle, String carNo) {
		super(name, jobTitle);
		this.carNo = carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	
	public void drive() {
		System.out.println(this.getName() + "운전하다.");
	}
	public void transport() {
		System.out.println(this.getName() + "운송하다.");
	}
}
