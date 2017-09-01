package day16;

public class Person {
	private String name;
	private int age;
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person) obj;
		return name == p.name && age == p.age;
	}*/
	
}
