/*
WAP to print Armstrong number from 1 to 1000.
*/

import java.util.*;
public class Lab1_12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			boolean val =  armstrong(i);
			if(val)
			System.out.println(i);
		}

	}
	public static boolean armstrong(int a){
	 	int c=0;
	 	int b=a;
	 	int d=a;
	 	while(a!=0){
			a=a/10;
	 		c++;
	 	}
	 	int[] arr = new int[c];
	 	for(int i=0;i<c;i++){
	 		arr[i]=b%10;
	 		b=b/10;
	 	}
	 	int sum=0;
	 	for(int i=0;i<c;i++){
	 		sum+=(Math.pow(arr[i],c));
	 	}
	 	if(sum==d){
	 		return true;
	 	}
	 	else{
	 		return false;	 		
	 	}
	 	
	}
}