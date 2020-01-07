package demo;

import java.util.Arrays;

public class shuzu {
	public static void main(String[] args) {
		int [] nums= {412,278,176,543,284,392,136,715};
		for(int j=0;j<nums.length-1;j++) {
			for(int i=0;i<nums.length-1;i++) {
				if(nums[i]>nums[i+1]) {
					int c=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=c;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
