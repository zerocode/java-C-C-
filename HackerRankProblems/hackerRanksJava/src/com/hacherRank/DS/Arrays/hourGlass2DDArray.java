package com.hacherRank.DS.Arrays;

import java.util.Scanner;

public class hourGlass2DDArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputData = new String[6];
		int[][] hourGlass = new int[6][6];
		for (int i = 0; i < 6; i++) {
			String row = input.nextLine();
			for (int j = 0; j < 6; j++) {
				String[] x = row.split(" ");
				hourGlass[i][j] = Integer.parseInt(x[j]);
			}
		}
		int sum = 0, max =-100;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				sum += hourGlass[i - 1][j - 1] + hourGlass[i - 1][j] + hourGlass[i - 1][j + 1] + hourGlass[i][j]
						+ hourGlass[i + 1][j - 1] + hourGlass[i + 1][j] + hourGlass[i + 1][j + 1];
				//System.out.println(sum);
				
				if (sum > max) {
					max = sum;
				}
				sum = 0;
			}
		}
		System.out.println(max);
	}

}
