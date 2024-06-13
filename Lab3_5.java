public class LAB3_5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {8,152,8,545,3};
		for(int i=0;i<arr.length;i++){
			for(j=i+1;j<arr.length;i++){
				if(arr[i]==arr[j]){
					System.out.println("true");
					break;
				}
			}
		}
		System.out.println(min+" "+max);
	}
}