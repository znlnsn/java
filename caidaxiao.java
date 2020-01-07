package demo;

import java.util.Scanner;

public class caidaxiao {
public static void main(String[] args) {
	int a=(int)(Math.random()*100)+1;
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("请输入猜测数字：");
		int b=sc.nextInt();
		if(b>a) {
			System.out.println("很遗憾，你猜的大了");
		}else if(b<a) {
			System.out.println("很遗憾，你猜的小了");
		}else {
			System.out.println("恭喜你猜的对了");
			break;
		}
	}
}
}
