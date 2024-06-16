
public class find_the_element_that_appear_twice_or_more {
    
    public static void main(String[] args) {
        int[] nums ={3,6,5,1};
    }
    public int dominantIndex(int[] nums) {
      int max=Integer.MIN_VALUE;
        int ind =-1;
        for(int i=0;i<nums.length;i++){
          if(nums[i]>max){
              max=nums[i];
              ind=i;
          } 
       }
        
        
        for(int i=0;i<nums.length;i++){
            if(i==ind) continue;
            else if(max<nums[i]*2)
                return -1;
        }
        
         return ind;
    }

}