import java.util.*;
public class Lab6_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scm = new Scanner(System.in);
		System.out.println("employee id: ");		
		int eid = sc.nextInt();
		System.out.println("Name: ");
		String name  = scm.nextLine();
		System.out.println("designation: ");
		String designation = scm.nextLine();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		Employee_Detail emp = new Employee_Detail(eid,name,designation,salary);
		emp.print();
	}
}

class Employee_Detail{
	int employee_id;
	String name;
	String designation;
	double salary;
	Employee_Detail(int employee_id,String name,String designation,double salary){
		this.employee_id = employee_id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public void print(){
		System.out.println("ID is :"+employee_id);
		System.out.println("name is :"+name);
		System.out.println("designation is :"+designation);
		System.out.println("Salary is :"+salary);
	}
}