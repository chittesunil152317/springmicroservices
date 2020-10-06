package com.Assignment1.Day1;

import java.util.Scanner;

public class Program9_InvertedPyramid {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows in the pyramid:");
		int noOfRows = scan.nextInt();
		int rowCount = noOfRows;
		System.out.println("Here is the pyramid:");
		for(int i = 0 ;i < noOfRows; i++) {
			for(int j= 1; j<= i*2;j++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j<= rowCount; j++) {
				System.out.print(j+" ");
			}
			for(int j = rowCount-1;j>= 1;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
			rowCount--;
		}
	}
}
