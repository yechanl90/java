package net.java_school.example;

public class Test {

	public static void main(String[] args) {
		Employee im = new Employee();
		im.setName("�Ӳ���");
		im.setJobTitle("�븮");
		System.out.println(im.toString());

		Manager hong = new Manager();
		hong.setName("ȫ�浿");
		hong.setJobTitle("����");
		hong.setManageJob("�λ�");
		System.out.println(hong.toString());
		
	}

}
