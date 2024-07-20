
public class AtoiNew {
    
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        String s = "+05";
        System.out.println(atoi(s));
    }
    public static int atoi(String s){
        String val="";
s=s.trim();
        if(s.length()==0)return 0;
    char chb = s.toLowerCase().charAt(0);
        if(chb>='a' && chb<='z')return 0;
        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);

            if((val.length()==0 && (ch=='-'||ch=='+'))||ch>=48 && ch<=57){

                

                val+=ch;

            }

            else break;

        }
      // System.out.println(val);
        if(val.length()==0)return 0;
        else if(val.length()==1 && (val.charAt(0)=='+'||val.charAt(0)=='-')) return 0;
try{
    int a= Integer.parseInt(val);
    System.out.println(a+"hi");
    return a;
}catch(Exception e){
    if(val.contains("+")&&val.contains("-")){
      
    if(val.length()-val.replaceAll("+","").length()!=1 ||val.length()-val.replaceAll("-","").length()!=1)return 0;
     }
    if(val.contains("-"))return Integer.MIN_VALUE;
    else if(val.contains("+"))return Integer.MAX_VALUE;
}
       // System.out.println(val); 
        return Integer.MAX_VALUE;
        
    }
}