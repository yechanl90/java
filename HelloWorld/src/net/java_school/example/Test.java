package net.java_school.example;

public class Test {

	public static void main(String[] args) {
		Employee im = new Employee("�Ӳ���", "�븮");
		System.out.println(im.toString());

		Manager hong = new Manager("ȫ�浿", "����", "�λ�");
		System.out.println(hong);
		
		Object jang = new Manager("����", "����", "����");
		System.out.println(jang);
		
		//jang.setManageJob("ȸ��");
		/* object class ������ Manage class�� method�� �����Ҽ� ���� */

		Manager janggilsan = (Manager)jang;
		janggilsan.setManageJob("ȸ��");
		System.out.println(janggilsan);
	}

}
