package com.Exceptions.Assignments;

import java.util.Scanner;

public class TryCatchEx {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the second number: ");
		int second = scan2.nextInt();
		divideNumbers(first, second);
	}
	public static void divideNumbers(int a, int b){
		float result = a/b;
		System.out.println("Division result of "+ a +"/"+b +"= " +result);
	}
}