package com.gradedproject.q2;

import java.util.Scanner;

public class Recursion {
	public static double pow(int x, int n) {
		if (n == 0) {
			return 1; // x^0 is 1 for any x (except 0)
		} else {
			return x * pow(x, n - 1);

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base number X: ");
		int x = sc.nextInt();
		System.out.print("Enter the power N = ");
		int n = sc.nextInt();
		int result = (int) pow(x, n);
		System.out.print("X power N is:" + result);
		sc.close();
	}
}