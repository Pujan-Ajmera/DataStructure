/*
Write a program to determine whether the entered character is vowel or not.
*/
import java.util.*;
public class Lab1_3{
	public static void main(String[] args) {
		String s ="aeiouAEIOU";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Character");
		char c=sc.next().charAt(0);
		if(s.contains(c+"")){
		System.out.println("yes");			
		}
		else{
		System.out.println("no");
		}
	}
}