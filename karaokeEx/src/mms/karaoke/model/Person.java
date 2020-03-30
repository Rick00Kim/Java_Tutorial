package mms.karaoke.model;

public class Person {
	private int index;
	private String name;
	private int age;
	public Person(int index, String name, int age) {
		this.index = index;
		this.name = name;
		this.age = age;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
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
}