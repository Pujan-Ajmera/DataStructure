
import java.util.*;

public class AstroidCollission {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] a ={8,-8};
        int[] ans = asteroidCollision(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;

        Stack<Integer> st = new Stack<>();
for(int i=0;i<n;i++){
    int last =0;
if(st.size() == 0){
st.add(asteroids[i]);
}

else{
int pk = st.peek();

if(pk>0 && asteroids[i]>0 || pk<0 && asteroids[i]<0){
st.add(asteroids[i]);
}

else{
while(st.size()>0 && (st.peek() > 0 && asteroids[i] < 0)){
if(Math.abs(st.peek()) < Math.abs(asteroids[i]) && (st.peek()>0 && asteroids[i]<0)){
last = st.pop();
}
else if((Math.abs(st.peek()) == Math.abs(asteroids[i]))){
last = st.pop();
break;
}
else{
break;
}
}
if(st.size() > 0 && ((st.peek()<0 && asteroids[i]>0)||(st.peek()<0 && asteroids[i]<0)) && Math.abs(asteroids[i])!=Math.abs(last)){
st.push(asteroids[i]);
    System.out.println(st+"++");
    last=0;
}
    if(st.size() == 0 && Math.abs(asteroids[i])!=Math.abs(last)){
        st.add(asteroids[i]);
    }
}
}
}
        int[] ans = new int[st.size()];
    for(int i=st.size()-1;i>=0;i--){
        ans[i] = st.pop();
    }
    return ans;
        
        
    }
    

}