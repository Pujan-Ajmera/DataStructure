public class h_index{
	public static void main(String[] args) {
		
	}
	public int hIndex(int[] citations) {
        int n = citations.length;
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            if(citations[i]>n){
                arr[n]+=1;
            }
            else{
                arr[citations [i]]+=1;
            }
        }
        int co=0;
        for(int i=n;i>=0;i--){
            co+=arr[i];
            if(i<=co) return i;
        }

        return -1;
    }
}