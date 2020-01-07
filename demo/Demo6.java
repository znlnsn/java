package demo;

public class Demo6 {
public static void main(String[] args) {
	int a,b,c;
	a=10;
	b=20;
	c=30;
	a+=10;
	b-=10;
	c*=2;
	c%=7;
	System.out.println(c);
//	a=10 b=20 a>b为假 输出b把b的值赋给d
	int d=a>b?a:b;
	System.out.println(d);
//	a=10 b=20 a<b为真 输出a把a的值赋给de
	int e=a<b?a:b;
	System.out.println(e);
			
}
}
