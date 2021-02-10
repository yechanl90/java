package net.java_school.example;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("È«±æµ¿");
		set.add("ÀÓ²©Á¤");
		set.add("Àå±æ»ê");
		set.add("È«°æ·¡");
		set.add("ÀÌÀç¼ö");
		set.add("È«±æµ¿");

		System.out.println(set);
		Set sortedSet = new TreeSet(set);
		System.out.println(sortedSet);
	}
}
