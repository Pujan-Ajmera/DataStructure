/*
Write a program to find power of a number using loop.
*/
import java.util.*;
public class Lab1_6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int res=1;
		for(int i=1;i<=m;i++){
			res=res*n;
		}
		System.out.println(res);
	}
}