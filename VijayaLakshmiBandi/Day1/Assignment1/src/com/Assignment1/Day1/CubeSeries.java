package com.Assignment1.Day1;

import java.util.Scanner;

public class CubeSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, i = 1;
		System.out.println("Enter the range of number(limit) :");
		num = scan.nextInt();
		while(i <= num) {
			System.out.print(i*i*i+" ");
			i++;
		}
		scan.close();
	}
}
