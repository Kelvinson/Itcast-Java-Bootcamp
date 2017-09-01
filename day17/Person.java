package day17;

public class Person implements Comparable {
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
	
	/**
	 *  1,31 is prime number,the only divisions are self and 1, 
	 *  2, 31 is not too big or too small
	 *  3. 31 equals 2^5-1, is easy to be in calculation. 2 left 
	 *  shift 5 bits and minus 1;
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 	   //the argument passed in and the object invoked is the same object 
			return true;	  // return true;
		if (obj == null)       //the argument passed in is null return false
			return false;
		if (getClass() != obj.getClass())  // the byte code class file is not the same
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
/*	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person) o;
		return (this.name.compareTo(p.name) == 0) ? this.age - p.age : this.name.compareTo(p.name);
	}
	*/
	/** 
	 * 	age is the primary factor to consider when comparing two persons
	 * 	name is the second factor to consider when comparing two persons
	 *//*
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Person p = (Person) o;
		return (this.age - p.age == 0) ? this.name.compareTo(p.name) : this.age - p.age;
	}*/
	@Override
	public int compareTo (Object o) {
		// TODO Auto-generated method stub
		Person p = (Person) o;
		int number = this.name.length() - p.name.length();
		return number == 0 ? this.name.compareTo(p.name) : number;
	}
	

	
	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("Is this method has been invoked?");
		Person p = (Person) obj;
		return this.name == p.name && this.age == p.age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		final int NUM = 38; 
		return name.hashCode() * NUM + age;
	}*/

	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person) obj;
		return name == p.name && age == p.age;
	}*/
	
}
