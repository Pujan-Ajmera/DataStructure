public class LAB3_4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int[] arr = {8,152,1,545,3};
		for(int i=0;i<n;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println(min+" "+max);
	}
}