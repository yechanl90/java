package net.java_school.classvar;

public class B {
	
	private A a = new A();
	
	{
		System.out.println("B instance block 角青");
	}
	
	static {
		System.out.println("B static block 角青");
	}
	
	private static B b = new B();
	
	private B() {
		System.out.println("B() 积己磊 角青");
	}
	
	public B(int a) {
		System.out.println("B(int) 积己磊 角青");
	}
	
	public static void main(String[] args) {
		new B();
		//new B(1);
	}

}
