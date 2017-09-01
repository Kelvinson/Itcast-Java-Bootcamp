package day14;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // given a string "91 27 46 38 50" code to output "27 38 46 50 91"
		String s = "91 27 46 38 50";
		String [] sArr = s.split(" ");
		// turn the string arrays to a int array of the same length as the string arrays.
		int [] arr = new int[sArr.length];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(arr);
		
		String output = "";
		for (int i = 0; i < arr.length; ++i) {
			if (i == arr.length - 1) {
				output = output + arr[i];
			} else {
				output = output + arr[i] + " "; 
			}
			
		}
		
		System.out.println(output);
		
		String output1 = "";

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; ++i) {
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			}
			else {
				sb.append(arr[i]+" ");
			}
		}
		
		output1 = sb.toString();
		System.out.println(output1);

		
	}
				

}
