package day8;

/**
 * 
 * @author kelvinson
 * the time of final variables initialized: 1.explicitly initialize 2.before the object is constructeds
 */
public class Test3_Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUM;
//		NUM = 20;
//		System.out.println(NUM);
		final Person p = new Person("zhangsan",23);
		p.setAge(24);
		System.out.println(p.getAge());
	}

}
class Teacher extends Person{	
	
	Teacher() {}; // person's empty contructor
	Teacher(String name, int age){
		super(name,age);
	}
	public void teach() {
		System.out.println("teacher teaches!");
	}
}

class Student extends Person {
	
	Student() {}; //student's empty construtor
	Student(String name, int age) {
		super(name,age);
	}
	public void learn() {
		System.out.println("student learns!");
	}
}

class Person {
	private String name;
	private int age;
	
	public Person() {};
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setAge( int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("person "+name + " eat!");
	}
}