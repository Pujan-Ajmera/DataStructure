import java.util.*;
public class Lab7_40{
	public static void main(String[] args) {
		String s = new String("aabb");
		Stack<Character> st = new Stack<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				st.push('a');
			}
			else if(s.charAt(i)=='b'){
				st.pop();
			}
			else{
				System.out.println("Invalid string");
				break;
			}
		}

		if(st.size()>0){
				System.out.println("Invalid string");
		}
		else{
				System.out.println("valid string");
		}
	}
}