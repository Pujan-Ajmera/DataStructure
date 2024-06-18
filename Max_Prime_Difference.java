import java.util.*;
public class Max_Prime_Difference{
	public static void main(String[] args) {
		int  nums = {4,2,9,5,3};
		Stack<Integer> s=new Stack<>();
		for(int i=0;i<nums.length;i++){
			int c=0;
			for(int j=1;j<=nums[i]/2;j++){
				if(nums[i]%j==0){
					c++;
				}
			}
			if(c==1){
				a.add(i);
			}
		}
		int min=Integer.MAX_VALUE;max=Integer.MIN_VALUE;
		Iterator ic= s.iterator();
		while(ic.hasNext()){
			int a = (int)ic.next();
			if(a>max){
				max=a;
			}
			if(a<min){
				min=a;
			}
		}
		System.out.println(Math.abs(min,max));
	}
}