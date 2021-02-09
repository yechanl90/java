package net.java_school.example;

public class Test {

	public static void main(String[] args) {
		Employee im = new Employee();
		im.setName("임꺽정");
		im.setJobTitle("대리");
		System.out.println(im.toString());

		Manager hong = new Manager();
		hong.setName("홍길동");
		hong.setJobTitle("과장");
		hong.setManageJob("인사");
		System.out.println(hong.toString());
		
	}

}
