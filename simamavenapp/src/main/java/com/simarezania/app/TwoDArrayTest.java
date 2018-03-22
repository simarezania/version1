package com.simarezania.app;

public class TwoDArrayTest {

	public static void main(String[] args) {

		int[][] multiples = new int[4][6];
		for (int i = 0; i < multiples.length; i++) {
			for (int j = 0; j < multiples[i].length; j++) {
				multiples[i][j] = 4 * i + j;

			}

		}
		
		
		for (int i = 0; i < multiples.length; i++) {
			for (int j = 0; j < multiples[i].length; j++) {
				System.out.print(multiples[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
