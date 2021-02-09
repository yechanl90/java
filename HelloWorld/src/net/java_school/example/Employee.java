package net.java_school.example;

public class Employee {

	private String name;
	private String jobTile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTile() {
		return jobTile;
	}
	public void setJobTile(String jobTile) {
		this.jobTile = jobTile;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append("|");
		sb.append(jobTile);
		
		return sb.toString();
	}
}
