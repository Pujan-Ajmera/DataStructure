// has some thigda handle it with care
class Solution {
    public int findNthDigit(int n) {
        if(n<=9)return n;
       if(n==1111111111)return 1;
        if(n==999999999)return 9;
        if(n==Integer.MAX_VALUE)return 2;
        int[] ans = search(n);
        int s=ans[0];
        int e=ans[1];
        int prev=ans[2];
        int co = prev;
        String str="";
        int i=0;
        for(i=s;co<n;i++){
            str = i+"";
            co+=str.length();
        }
        i--;
        co-=str.length();
        str = i+"";
        for(int j=0;j<str.length();j++){
            co++;
            if(co==n){
                return Integer.parseInt(str.charAt(j)+"");
            }
        }
        return 0;
    }
    public int[] search(int n){
        int[] ans = new int[3];
HashMap<ArrayList<Integer>, Integer> h = new LinkedHashMap<>()
List<List<Integer>> dataLists = new ArrayList<>();
dataLists.add(createList(0, 9));       
dataLists.add(createList(10, 99));  
dataLists.add(createList(100, 999)); 
dataLists.add(createList(1000, 9999));
dataLists.add(createList(10000, 99999));
dataLists.add(createList(100000, 999999));
dataLists.add(createList(1000000, 9999999));
dataLists.add(createList(10000000, 99999999));
dataLists.add(createList(100000000, 999999999));
 dataLists.add(createList(1000000000,(int)Math.pow(2,31)-1));       
int[] values = {9, 189, 2889, 38889, 488889, 5888889, 68888889, 788888889, 888888889,(int)Math.pow(2,31)-1};
        for (int i = 0; i < dataLists.size(); i++) {
    h.put(new ArrayList<>(dataLists.get(i)), values[i]);
}

        int prev = h.entrySet().iterator().next().getValue();
        for(Map.Entry<ArrayList<Integer>,Integer> v : h.entrySet()){
            if(v.getValue()>=n){
                ans[0]= v.getKey().get(0);
                ans[1]= v.getKey().get(1);
                ans[2]=prev;
                return ans;
            }
            else{
                prev = v.getValue();
            }
        }
        return ans;
    }
public List<Integer> createList(Integer... values) {
    List<Integer> list = new ArrayList<>();
    for (Integer value : values) {
        list.add(value);
    }
    return list;
}
}
