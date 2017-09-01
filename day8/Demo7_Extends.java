package day8;

public class Demo7_Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Son s = new Son();
     s.print();
	}

}

class Father {
	public void print() {
		System.out.println("Fu print");
	}
}

class Son extends Father {
	public void method() {
		System.out.println("Zi Method ");
	}
	
	public void print() {
		System.out.println("Zi print");
		super.print(); //super invoke father's mehtods;

	}
}