package day16;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo3_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		Tool<String> t = new Tool<>();
		t.show(true);
	}

	public static void demo1() {
		Tool t = new Tool();
		t.setObj(new Student("zhang",24));
		t.show(true);

		/*		Worker w =  (Worker)t.getObj(); // cast downwards
		System.out.println(w);*/
	}

}
