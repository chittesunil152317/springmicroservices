package com.Assignment1.Day1;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int cumValue = 0, moduleValue, temp;
		int num = 153;
		temp = num;
		while(num > 0) {
			moduleValue = num%10;
			num = num/10;
			cumValue = cumValue+(moduleValue*moduleValue*moduleValue);
		}
		if(temp == cumValue) {
			System.out.println(temp+" is a Armstrong Number");
		}else {
			System.out.println(temp+" is not a Armstrong Number");
		}
	}
}
