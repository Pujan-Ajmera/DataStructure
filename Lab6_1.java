public class Lab6_1{
	public static void main(String[] args) {
		int a=5,b=10;
		System.out.println(a+" "+b);
		swap s = new swap(a,b);
		s.swaping();
		a=s.a;
		b=s.b;
		System.out.println(a+" "+b);		
	}
}


class swap{
	int a;
	int b;
	swap(int a,int b){
		this.a=a;
		this.b=b;
	}

	public void swaping(){
		int temp=a;
		a=b;
		b=temp;
	}

}