package day14;

public class Demo3_System {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		//demo1();
		//demo2();
		//demo3();
		int []  src = {11,22,33,44,55};
		int [] dest  = new int[8];
		
		for (int i = 0; i < dest.length; ++i) {
			System.out.println(dest[i]);
		}
		System.arraycopy(src, 0, dest, 0, src.length);
		
		for (int i = 0; i < dest.length; ++i) {
			System.out.println(dest[i]);
		}
	}

	public static void demo3() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 2000; i++) {
			System.out.println("x");
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	public static void demo1() {
		for (int i = 0; i < 100; ++i) {
			Demo fi1 = new Demo();
			System.gc();  // run the garbage collector, it is like to call the madian of house cleaning 
		}
	}

	public static void demo2() {
		System.exit(0); // a non-zero code will cause the system to exit the JVM
		System.out.println("111");
	}
}

// in a source file only a public is allowed so Demo class has to be not by
// public
class Demo {

	public void finalize() {
		// TODO Auto-generated method stub
		System.out.println("Grabage is cleaned by system!");
	}

}
