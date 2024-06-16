
public class LongestSubstringBWTwoEqualChar {
    
    public static void main(String[] args) {
        String s ="cbzxy";
        int max =Integer.MIN_VALUE;
        boolean val=false;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int v1 = s.indexOf(c);
            int v2 =s.lastIndexOf(c);
            
            if(v1!=v2){
                max =Math.max(max,(v2-v1-1));
            }
            if(max>=0){
                val=true;
            }
        }
        if(val)
        System.out.println(max);
        else
        System.out.println("-1");
    }
}