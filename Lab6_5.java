/*
Create a class BankAccount with attributes like account number, balance,
account holder and name. Create an array of BankAccount objects to store
bank accounts. Implement methods to deposit money, withdraw money and
check balance.
*/
import java.util.*;
public class Lab6_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scm = new Scanner(System.in);
		long account_number;
		double balance;
		String accountholder;
		String name;

		System.out.print("Enter nnumber of BankAccount: ");
		int n = sc.nextInt();
		BankAccount[] ba = new BankAccount[n];
		int v;
		for(int i=0;i<n;i++){
			System.out.print("Enter account_number");
			account_number = sc.nextLong();
			System.out.print("Enter balance");
			balance = sc.nextDouble();
			System.out.print("Enter accountholder");
			accountholder = scm.nextLine();
			System.out.print("Enter name");
			name = scm.nextLine();
			ba[i] = new BankAccount(account_number,balance,accountholder,name);
			System.out.println("Enter 1 for deposit 2 for withdraw and 3 to check balance");
			v = sc.nextInt();

			if(v==1){
				System.out.println("Enter deposit amount");
				int depo = sc.nextInt();
				ba[i].deposit(depo);
			}

			else if(v==2){
				System.out.println("Enter withdaraw amount");
				int with = sc.nextInt();
				ba[i].withdraw(with);	
			}
			else if(v==3){
				ba[i].checkbalance();				
			}else{
				System.out.println("Nothing entered");
			}
		}	

	}
}

class BankAccount{
	long account_number;
	double balance;
	String accountholder;
	String name;
	
	BankAccount(long account_number,double balance,String accountholder,String name){
		this.account_number=account_number;
		this.balance=balance;
		this.accountholder=accountholder;
		this.name=name;
	}
	public void deposit(int amt){
		balance+=amt;
		checkbalance();	
	}

	public void withdraw(int amt){
		if(balance-amt<1000){
			System.out.print("Cannot withdraw");
		}
		else{
			balance-=amt;
			checkbalance();	
		}
		
	}

	public void checkbalance(){
		System.out.println("Balance is :"+balance);
	}
}
