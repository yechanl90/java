package net.java_school.example;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("ȫ�浿");
		set.add("�Ӳ���");
		set.add("����");
		set.add("ȫ�淡");
		set.add("�����");
		set.add("ȫ�浿");

		System.out.println(set);
		Set sortedSet = new TreeSet(set);
		System.out.println(sortedSet);
	}
}
