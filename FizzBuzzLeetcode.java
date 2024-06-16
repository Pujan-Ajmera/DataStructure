import java.util.*;
public class FizzBuzzLeetcode {
    
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<String> answer = new Vector<>();
        for(int i=0;i<n;i++){
                    if((i+1)%3==0 && (i+1)%5==0) answer.add("fizzbuzz");
                    else if((i+1)%3==0) answer.add("fizz");
                    else if ((i+1)%5==0) answer.add("buzz");
                    else answer.add((i+1)+"");
        }
        System.out.println(answer);
       
    }
    
}