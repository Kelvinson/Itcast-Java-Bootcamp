package day15;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Demo5_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec  = new Vector();
		
		vec.add("a");
		vec.add("b");
		vec.add("c");
		vec.add("world");
		
		Enumeration enu = vec.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		

	}

}
