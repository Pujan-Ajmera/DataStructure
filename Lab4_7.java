import java.util.*;
public class Lab4_7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String string = sc.nextLine();

		System.out.print("Enter 1 for uppercase and 2 for lowercase: ");
		Scanner sV = new Scanner(System.in);
		int n = sV.nextInt();
		String ans="";
		if(n==1){
			for(int i=0;i<string.length();i++){
				if(string.charAt(i)>=97 && string.charAt(i)<=122){
					ans+=(char)(string.charAt(i)-32);
				}
				else{
					ans+=string.charAt(i);
				}
			}
		}

		else{
			for(int i=0;i<string.length();i++){
				if(string.charAt(i)>=65 && string.charAt(i)<=90){
					ans+=(char)(string.charAt(i)+32);
				}
				else{
					ans+=string.charAt(i);
				}
			}
		}
		System.out.print(ans);
	}
}