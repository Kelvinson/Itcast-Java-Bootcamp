package day8;

public class Demo7_Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ios8 i = new Ios8();
		i.siri();
		i.call();
		i.play();
	}
	

}

class Ios7 {
	public void call() {
		System.out.println("calling");
	}
	{
		System.out.println("ios7");
	}
	public static void play( ) {
		System.out.println("play1");
	}
	public void siri() {
		System.out.println("speak English");
	}
}

class Ios8 extends Ios7 {
	public void siri() {
		System.out.println("speak Chinese");
		super.siri();
	}
	static {
		System.out.println("ios8");
	}
	public static void play() {
		System.out.println("play2");
	}
}