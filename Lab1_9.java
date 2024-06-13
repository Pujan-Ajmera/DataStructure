/*
WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS
[e.g. 10000 seconds mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].
*/

import java.util.*;
public class Lab1_9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter one time");
		int n = sc.nextInt();
		int h=n/3600;
		n=n%3600;
		int m=n/60;
		n=n%60;
		System.out.println(h+":"+m+":"+n);
	}
}