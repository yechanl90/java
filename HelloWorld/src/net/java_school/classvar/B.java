package net.java_school.classvar;

public class B {
	
	private A a = new A();
	
	{
		System.out.println("B instance block ����");
	}
	
	static {
		System.out.println("B static block ����");
	}
	
	private static B b = new B();
	
	private B() {
		System.out.println("B() ������ ����");
	}
	
	public B(int a) {
		System.out.println("B(int) ������ ����");
	}
	
	public static void main(String[] args) {
		new B();
		//new B(1);
	}

}
