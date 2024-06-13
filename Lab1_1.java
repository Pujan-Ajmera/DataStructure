/*
Write a program to calculate area of a Circle (A = πr2).
*/

import java.util.*;
public class Lab1_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("enter a number ");
			int n = sc.nextInt();
		double area = Math.PI * Math.pow(n,2);
		System.out.println(area);
	}
}