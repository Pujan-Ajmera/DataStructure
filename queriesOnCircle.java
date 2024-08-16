class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
         int x=queries[i][0];
         int y=queries[i][1];
         int r=queries[i][2];   
            int val=0;
            for(int j=0;j<points.length;j++){
           int x1=points[j][0];
           int y1=points[j][1];
       if(checker(x,y,r,x1,y1)){
           val++;
       }     
           }
     ans[i]=val;       
        }
        return ans;
    }
    
    public boolean checker(int x,int y,int r,int x1,int y1){
        return (x-x1)*(x-x1)+(y-y1)*(y-y1)-r*r<=0;
    }
       }
