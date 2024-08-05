class Solution {
    public String frequencySort(String s) {
        int n=s.length();

        HashMap<Character,Integer> h = new HashMap<>();

        

        for(int i=0;i<n;i++){

            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);

        }

        ArrayList<Character> al = new ArrayList<>(h.keySet());

        ArrayList<Integer> freq = new ArrayList<>(h.values());

        

 

      

        

        String ans="";

        n=freq.size();

        for(int i=0;i<n;i++){

            int max = freq.get(i);

            int ind = i;

            for(int j=i+1;j<n;j++){

                if(freq.get(j)>max){

                    max = freq.get(j);

                    ind = j;

                }

            }

            char ch = al.get(ind);

            for(int k=1;k<=max;k++){

                ans+=ch;

            }

            int val = freq.get(i);

            freq.set(i,max);

            freq.set(ind,val);

            

            ch = al.get(i);

            al.set(i,al.get(ind));

            al.set(ind,ch);

            

          

        }
        return ans;
    }
}
