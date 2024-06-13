/*
. WAP to find the sum of 1 + (1+2) + (1+2+3) + (1+2+3+4)+ …+(1+2+3+4+….+n).
*/

import java.util.*;
public class Lab1_11{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one number");
		int n = sc.nextInt();
		int sumval=0;
		for(int i=1;i<=n;i++){
			sumval+=sum(i);
		}
	System.out.println(sumval);

	}
	public static int sum(int a){
		if(a==1){
			return 1;
		}
		else{
			return a*(a+1)/2;
		}
	}
}