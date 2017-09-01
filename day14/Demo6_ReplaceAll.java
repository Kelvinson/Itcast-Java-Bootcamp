package day14;

public class Demo6_ReplaceAll {

	public static void main(String[] args) {
		//public String replaceAll(String replacement)
		String name = "wo1ai2h3333eima";
		String str = name.replaceAll("\\d", "");
		System.out.println(str);  
	}

}
