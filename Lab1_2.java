/*Write a program to find whether a number is odd or even*/
import java.util.*;
public class Lab1_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("enter a number ");
			int n = sc.nextInt();
		if(n%2==0)
		System.out.println("even");
		else
		System.out.println("odd");

	}
}