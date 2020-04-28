package com.averyday.demo.base.set;

import java.util.Objects;

/**
 * Description
 * Author ayt  on
 */
public class Person  implements Comparable<Person>{
	private String name;
	private int age;

	/**
	 * 按年龄大小后按姓名
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Person o) {
		int num = this.age - o.age;
		return num ==0 ? this.name.compareTo(o.name) : num  ;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;
		Person person = (Person) o;
		return getAge() == person.getAge() &&
				Objects.equals(getName(), person.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getAge());
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}


}
