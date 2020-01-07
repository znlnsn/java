package demo;

public class Demo4 {
public static void main(String[] args) {
	int a=20;
//	++在前先加1再赋值
//	++在后先复制再加1
	int d=a++;
	System.out.println(d);//20
	d=++a;
	System.out.println(d);//22
}
}
