public class LAB3_2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum=0;
		System.out.println("enter array elements");
		for(i=n;i<=m;i++){
			sum+=i;
		}
		System.out.println("sum "+sum);
	}
}