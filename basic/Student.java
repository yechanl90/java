public class Student {
	String name;
	String mobile;
	int absentSum;
	int comeLateSum;
	int leaveEarlySum;

	void absent() {
		absentSum = absentSum + 1;
	}
	
	void comLate() { 
		comeLateSum = comeLateSum +1;
	}
	void leaveEarly() { 
		leaveEarlySum  = leaveEarlySum + 1;
	}

	public static void main(String[] args) {
		Student hong = null;
		Student im = null;
		
		hong = new Student();
		hong.name = "홍길동";
		hong.mobile = "010-1111-2222";
	
		im = new Student();
		im.name = "임꺽정";
		im.mobile = "010-3333-4444";
	
		hong.absent();
		hong.absent();

		im.absent();
		
		System.out.println(hong.absentSum);
		System.out.println(im.absentSum);
	}
}