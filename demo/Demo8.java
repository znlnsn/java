package demo;

import java.util.Scanner;

public class Demo8 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入成绩：");
	int pr=sc.nextInt();
	if(pr>=90&&pr<=100) {
		System.out.println("学生的成绩为：A");
	}
	else if(pr>=80) {
		System.out.println("学生的成绩为：B");
	}else if(pr>=70) {
		System.out.println("学生的成绩为：C");
	}
	else if(pr>=60) {
		System.out.println("学生的成绩为：D");
	}
	else {
		System.out.println("学生的成绩为：E");
	}
}
}
