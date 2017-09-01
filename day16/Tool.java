package day16;

public class Tool<T> {
	private T t;

	public T getObj() {
		return t;
	}

	public void setObj(T t) {
		this.t = t;
	}
	
	/*public void show(Q q) { // type of generic mehtods has to be consistant with the generic type
		System.out.println(t);
	}*/
	
   public <T> void show(T t) {
		System.out.println(t);
	}

	// this is also right you specify a type of this method own type
   /**
    *  the generic type of class method is better to be the same with the class
    *  however you can always specify your own type when this happens, specify 
    *  the type of method before void specifier
    */
	/*public<Q> void show (Q a) {
		System.out.println(a);
	}
*/	
   // you have always to set the generic type for the static method for it's loaded before the 
   // objects of the class loaded
   /*public static<W> void print(W w) {  // 
	   
   }*/
}
