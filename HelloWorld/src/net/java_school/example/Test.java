package net.java_school.example;

public class Test {

	public static void main(String[] args) {
		Employee im = new Employee("임꺽정", "대리");
		System.out.println(im.toString());

		Manager hong = new Manager("홍길동", "과장", "인사");
		System.out.println(hong);
	}

}
