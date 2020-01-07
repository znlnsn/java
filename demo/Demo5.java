package demo;

public class Demo5 {
public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a>=b);
	System.out.println(a<=b);
	System.out.println(a!=b);
	System.out.println(a==b);
	System.out.println(a==b|a<b);
	System.out.println(!(a==b));
	
	if(a!=10&&a++==11){
		System.out.println(a);
		System.out.println("123456");
	}else {
	
	System.out.println(a);
	System.out.println("abcdef");
	}
	
}
}
