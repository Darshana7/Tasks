package com.te.prac;

import java.util.ArrayList;
import java.util.Iterator;

public class MinMaxOfArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(66);
		list.add(22);
		list.add(-33);
		list.add(11);
		list.add(-22);
		Integer minimum = list.stream().sorted().min(Integer::compare).get();
		Integer maximum = list.stream().sorted().max(Integer::compare).get();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(minimum);
		list2.add(maximum);
		Integer[] integer = new Integer[list2.size()];
		Integer[] array = list2.toArray(integer);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
