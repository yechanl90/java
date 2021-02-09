package net.java_school.example;

public class Manager extends Employee{
	private String manageJob;
	
	public Manager() {}
	
	public Manager(String name, String jobtitle, String manageJob) {
		super(name, jobtitle);
		this.manageJob = manageJob;
		/* sub class의 생성자를 정의할 때, 반드시 super class 생성자를
		 * 호출하는 코드가 있어야 한다.*/
	}
	
	public String getManageJob() {
		return manageJob;
	}
	public void setManageJob(String manageJob) {
		this.manageJob = manageJob;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName());
		sb.append("|");
		sb.append(this.getJobTitle());
		sb.append(manageJob);
		
		return sb.toString();
	}

}
