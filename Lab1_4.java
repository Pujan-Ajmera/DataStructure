/*  
Write a program to find factorial of a number. (Using Loop)
*/

import java.util.*;
public class Lab1_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int res=1;
		for(int i=2;i<=n;i++){
			res=res*i;
		}
		System.out.println(res);
	}
}