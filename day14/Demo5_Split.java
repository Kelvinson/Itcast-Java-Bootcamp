package day14;

public class Demo5_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "guo meimei day one";
		// the output of splitting usign '.' character is "guo meimei day one"
		// Note this is not "\." or single '.'
		String [] strArray = s.split("\\."); 
		for (int i  = 0; i < strArray.length; ++i) {
			System.out.println(strArray[i]);
		}

	}

}
