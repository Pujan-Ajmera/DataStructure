import java.util.*;
public class Lab6_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scm = new Scanner(System.in);
		System.out.println("Enter a value to convert");
		int a = sc.nextInt();
		Conversion conv = new Conversion(a);

		System.out.println("Enter c for celcius and f for farinheit");
		char b = scm.nextLine().charAt(0);

		if(b=='c'){
			conv.toCelcius();
		}
		else{
			conv.toFarinheit();
		}		
	}
}

class Conversion{
	double val;
	Conversion(double val){
		this.val = val;
	}

	public void toCelcius(){
		double ans = (val-32)*5/9;
		System.out.println("celcius value of "+val+" is "+ans);
	}
	public void toFarinheit(){
		double ans = (val * 9 / 5)+32;
		System.out.println("Ferinhite value of "+val+" is "+ans);
	}

}