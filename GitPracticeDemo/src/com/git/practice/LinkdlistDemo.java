package com.git.practice;

import java.util.LinkedList;

public class LinkdlistDemo {
	
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(2);
		l.add(4);
		System.out.println(l);
		System.out.println("Using foreach");
		for (Integer in : l) {
			System.out.println(in);
		}
	}

}
