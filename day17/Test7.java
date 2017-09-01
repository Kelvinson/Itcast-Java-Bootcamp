package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test7 {
	/**
	 * define a student class having member
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the info for the student as the format: name chinese math english score respectively");
		
		TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				int num = o2.getSum() - o1.getSum();
				return num == 0? 1: num;
			}
		});
		
		while (ts.size() < 5) {
			String line = sc.nextLine();
			String []  arr = line.split(",");
			
			int chinese = Integer.parseInt(arr[1]);
			int math = Integer.parseInt(arr[2]);
			int english = Integer.parseInt(arr[3]);
			
			ts.add(new Student(arr[0],chinese,math,english));
		}
		
		System.out.println("the students after sorting:");
		
		for (Student s : ts) {
			System.out.println(s);
		}

	}

}
