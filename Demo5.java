package demo0103;

import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ts="本模块包含求和、猜数字、排序三个内容,"
				+ "1对应求和，2对应猜数字，3对应排序，请选择：";
		System.out.println(ts);
		int ss=sc.nextInt();
		if(ss==1) {
			//用户输入两个整数，程序相加并输出结果
			//在控制台输出一个字符串
			System.out.println("请输入第一个整数：");
			//将用户输入的值赋值给变量a
			int a = sc.nextInt();
			System.out.println("请输入第二个整数：");
			//将用户输入的值赋值给变量b
			int b = sc.nextInt();
			//a+b将结果赋值给整型变量sum
			int sum=a+b;
			//在控制台输出sum
			System.out.println("求和结果为："+sum);
		}else if(ss==2) {
			//生成一个1-100之间的整数
			int a=(int)(Math.random()*100)+1;
			while(true) {
				//友情提示
				System.out.println("请输入猜测数字：");
				//等待输入并获取值
				int b=sc.nextInt();
				//判断变量a和变量b是否相等
				//boolean res=(a==b);
				if(b>a) {
					System.out.println("很遗憾，你猜的大了");
					
				}else if(b<a){
					System.out.println("很遗憾，你猜的小了");
				}else {
					System.out.println("恭喜你，猜对了");
					break;
				}
			}
		}else if(ss==3) {
			//创建一个整型数组并静态初始化
			int [] nums= {412,278,176,543,284,392,136,715};
			//int [] nums1= {1,2,3,4,5,6,7,8};
			//nums.length 获取数组的长度
			for(int j=0;j<nums.length-1;j++) {
				for(int i=0;i<nums.length-1;i++) {
					//比较数组中下标为i和i+1元素的大小
					//如果下标为i的元素大于下标为i+1的元素，则两个元素互换在数组中的位置
					if(nums[i]>nums[i+1]) {
						//假如 i=1
						//nums[i]=278;
						//c=278
						int c=nums[i];
						//nums[i]=176;
						nums[i]=nums[i+1];
						//nums[i+1]=278;
						nums[i+1]=c;
					}
				}
			}
			System.out.println(Arrays.toString(nums));
		}				
	}
}
