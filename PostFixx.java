import java.util.*;
public class PostFixx {
    
    public static void main(String[] args) {
        System.out.println("Enter a string ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();
        String polish="";
        st.push('(');
        int i=0;
        while(i<s.length()){
            if(st.size()<=0){
                System.out.println("invalidhu");
                break;
            }
            char next = s.charAt(i);
            while(g(st.peek())>f(next)){
                char temp = st.pop();
                polish+=temp;
            }
            if(g(st.peek())!=f(next)){
                st.push(next);
            }
            else{
                st.pop();
            }
            i++;
        }
        if(st.size()!=0){
            System.out.println(st.size());
            System.out.println("invalivvfd");
            System.out.println(polish);
        }
        else{
            System.out.println(polish);
        }
        
    } 
    
    
    public static int f(char ch){
        if(ch=='+'||ch=='-'){
            return 1;
        }
        else if(ch=='*'||ch=='/'){
            return 3;
        }
        
        else if(ch=='^'){
            return 6;
        }
        else if(ch=='('){
            return 9;
        }
        else if(ch==')'){
            return 0;
        }
        else{
            return 7;
        }
    }
    
    public static int g(char ch){
        if(ch=='+'||ch=='-'){
            return 2;
        }
        else if(ch=='*'||ch=='/'){
            return 4;
        }
        
        else if(ch=='^'){
            return 5;
        }
        else if(ch=='('){
            return 0;
        }
        else{
            return 8;
        }
    }
    
    public static int r(char ch){
        if(ch=='+'|| ch=='-'||ch=='*'||ch=='/'||ch=='^'){
            return -1;
        }
        else{
            return 1;
        }
    }
}