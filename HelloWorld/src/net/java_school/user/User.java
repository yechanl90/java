package net.java_school.user;

public class User {
	
	public static int total;
	private String id;
	

	public User(String id) {
		this.id = id;
		total++;
	}

	public static void main(String[] args) {
		User user1 = new User("yechan");
		User user2 = new User("gildong");
		User user3 = new User("eunji");

		System.out.println("total = " + User.total);
		System.out.println("total = " + total);
	}

}
