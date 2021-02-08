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
}