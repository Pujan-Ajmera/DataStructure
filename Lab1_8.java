/*
	Write a program to check whether a number is prime or not.
*/

import java.util.*;
public class Lab1_8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one number");
		int n = sc.nextInt();
		int c=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
			c++;
			}
		}
		if(c==1){
			System.out.println("yes");
		}
		else{
			System.out.println("no");			
		}
	}
}