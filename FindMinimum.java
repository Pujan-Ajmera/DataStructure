
public class FindMinimum {
    
    public static void main(String[] args) {
       int[] nums = {6,5,4,3,2,1}; 
        int val = findMin(nums);
       System.out.println(val);
    }
    
    public static int findMin(int[] nums) {
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}