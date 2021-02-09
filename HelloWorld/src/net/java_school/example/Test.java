package net.java_school.example;

public class Test {

	public static void main(String[] args) {
		Employee im = new Employee("임꺽정", "대리");
		System.out.println(im.toString());

		Manager hong = new Manager("홍길동", "과장", "인사");
		System.out.println(hong);
		
		Object jang = new Manager("장길산", "부장", "영업");
		System.out.println(jang);
		
		//jang.setManageJob("회계");
		/* object class 변수로 Manage class의 method에 접근할수 없음 */

		Manager janggilsan = (Manager)jang;
		janggilsan.setManageJob("회계");
		System.out.println(janggilsan);
	}

}
