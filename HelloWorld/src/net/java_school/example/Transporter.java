package net.java_school.example;

public class Transporter implements Drivable {
	private String carNo;

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	@Override
	public void drive() {
		System.out.println("운전하다.");
		
	}

	@Override
	public void transport() {
		System.out.println("운송하다.");		
	}

}
