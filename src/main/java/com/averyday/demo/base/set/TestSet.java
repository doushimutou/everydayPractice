package com.averyday.demo.base.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Description
 * Author ayt  on
 */
public class TestSet {
	public static void main(String[] args) {
		//testHashSet();
//		testHashSet2();
		testTreeSet();
	}

	public static void testTreeSet() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("zhangsan", 9));
		ts.add(new Person("lisi", 10));
		ts.add(new Person("wangwu", 15));

		System.out.println(ts);
	}


	public static void testHashSet2() {
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("lisi", 2));
		hs.add(new Person("lisi", 2));
		hs.add(new Person("lisi", 2));
		System.out.println(hs);


	}

	public static void testHashSet() {
		//Set存取无序，元素唯一
		HashSet<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("c");
		hs.add("b");
		hs.add("d");
		for (int i = 0; i < 100; i++) {
			System.out.println(hs);
		}
	}
}
