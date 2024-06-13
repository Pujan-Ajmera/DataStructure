/*
WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1
week and 3 days].
*/
import java.util.*;
public class Lab1_10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one number");
		int n = sc.nextInt();
		int h=n/364;
		n=n%364;
		int m=n/7;
		n=n%7;
		System.out.println(h+":"+m+":"+n);
	}
}