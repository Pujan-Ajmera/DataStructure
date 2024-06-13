/*  
Write a program to find factorial of a number. (Using Loop)
*/

import java.util.*;
public class Lab1_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int res= fact(n);
		System.out.println(res);
	}
	public static int fact(int a){
		if(a==1){
			return 1;
		}
		else{
			return a*fact(a-1);
		}
	}
}