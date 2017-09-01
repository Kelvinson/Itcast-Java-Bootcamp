package day14;

/**
 * 
 * @author kelvinson
 * exam a qq number is valid by: 5-15 nubmers , cannot be started with 0 and should be all numbers
 */
public class Demo1_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println(checkQQ("999999999929"));
	  System.out.println(checkQQ("aa99b9929"));
	  
	  String regex = "[1-9]\\d{4,14}";
	  System.out.println("999999999929".matches(regex));
	  System.out.println("aa99b9929".matches(regex));
	}
	
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) {
			if(!qq.startsWith("0")) {
			   char[] qq_Array = qq.toCharArray();
			   for (int i = 0; i< qq_Array.length; ++i) {
				   if (!(qq_Array[i] >= '0' && qq_Array[i] <= '9')) {
					   flag = false;
				   }
			   }
			}
			else {
				flag = false;
			}
		}
		else {
			flag = false;
		}
		
		return flag;
	}

}
