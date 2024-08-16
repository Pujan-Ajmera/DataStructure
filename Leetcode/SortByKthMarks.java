class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;
            for(int i=0;i<n;i++){
         int maxInd=i;
         int maxval=score[i][k];
  for(int j=i+1;j<n;j++){
             if(score[j][k]>maxval){
                 maxval=score[j][k];
           maxInd=j;      
             } 
          } 
         int[] temp=score[i];
         score[i]=score[maxInd]; 
          score[maxInd]=temp; 
       }
        return score;
    }
}
