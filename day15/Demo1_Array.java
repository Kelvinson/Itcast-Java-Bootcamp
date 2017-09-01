package day15;

public class Demo1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Student[] arr = new Student[5]; //array of reference type
		arr[0] = new Student("zhangsha",23);
		arr[1] = new Student("lisi",22);
		arr[2] = new Student("wangwu",23);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		

	}

}
