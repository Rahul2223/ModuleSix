package io;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayLink {

	public static void main(String[] args) {

		ArrayDemo();
		LinkedListDemo();
	}

	public static void ArrayDemo() {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);

		for (Integer i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("After Reversing");
		for (int i = num.size() - 1; i >= 0; i--) {
			int a = num.get(i);
			System.out.print(a + " ");
		}
	}

	public static void LinkedListDemo() {
		LinkedList<String> str = new LinkedList<String>();
		str.add("Java");
		str.add("Selenium");
		str.add("TestNg");
		str.add("Programming");
		System.out.println("Before Reversing");
		System.out.println(str.toString());

		Collections.reverse(str);
		System.out.println("After Reversing");
		System.out.println(str);
	}

}
