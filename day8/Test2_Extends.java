package day8;

public class Test2_Extends {

	public static void main(String[] args) {
		/**
		 * Fu.class and Zi.class are first loaded into the memory before a Zi object is constructed
		 * static block for Fu and Zi first executed and then invoke the construct code block(Fu->Zi)
		 * and then the construct methods for Fu and Zi;
		 */
		
		Zi z = new Zi(); 
	}
	
}

class Fu {
	static {
		System.out.println("static code block for Fu");
	}
	
	{
		System.out.println("construct code block for Fu");
	}
	
	public Fu() {
		System.out.println("constructing methods Fu");
	}
}


class Zi extends Fu {
	static {
		System.out.println("static code block for Zi");
	}
	
	{
		System.out.println("construct code block for Zi");
	}
	
	public Zi() {
		System.out.println("constructing methods Zi");
	}
}