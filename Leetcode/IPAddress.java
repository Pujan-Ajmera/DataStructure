import java.util.*;
public class IPAddress {
    
    public static void main(String[] args) {
        String queryIP ="1e1.4.5.6" ;
        int n= queryIP.length();
        if(queryIP.charAt(n-1)==':'||queryIP.charAt(n-1)=='.') System.out.println("yes");
        if(queryIP.contains(".")){
            String ans =  dot(queryIP);
            System.out.println(ans);
        }
        else{
            String ans =  colon(queryIP);
        }
        
        
    }
    public static String dot(String s){
        String[] sa = s.split("\\.");
        System.out.println(Arrays.toString(sa));
        for(int i=0;i<sa.length;i++){
            sa[i]=sa[i].trim();
            if(sa[i].length()>3 || sa[i].length()==0){
                return "INVALID";
            }
            else{
                   for(int j=0;j<sa[i].length();j++){
                    char ch= sa[i].charAt(j);
                    if((ch<48 || ch>57)){
                        return "INVALID";
                    }
                   }
                if(sa[i].compareTo("256")<0){
                    char c=sa[i].charAt(0);
                    char d=sa[i].charAt(1);
                    
                    if(sa[i].length()==2 && sa[i].charAt(0)=='0'){
                        return "IPv4";
                    }
                    else if(sa[i].length()==3 && d!='0'&&c!='0' && sa[i].compareTo("256")!=0){
                        return "IPv4";
                    }
                }
                    else if(sa[i].compareTo("256")==0){
                        return "NEITHER";
            }
                
            }
        }
        return "";
    }
    
    public static String colon(String s){
        String[] sa = s.split("\\:");
        System.out.println(Arrays.toString(sa));
        
        for(int i=0;i<sa.length;i++){
            sa[i]=sa[i].trim();
            if(sa[i].length()>4||sa[i].length()==0){
                return "INVALID";
            }
            else{
                for(int j=0;j<sa[i].length();j++){
                    char ch= sa[i].charAt(j);
                    if((ch=='A'||ch=='B'||ch=='C'||ch=='D'||ch=='E'||ch=='F')||(ch=='a'||ch=='b'||ch=='c'||ch=='d'||ch=='e'||ch=='f')||(ch>=48 && ch<=57)){
                        
                    }
                    else{
                        return "INVALID";
                    }
                }
            }
        }
        return "IPv6";
    }
}