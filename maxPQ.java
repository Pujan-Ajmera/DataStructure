import java.util.*;
public class maxPQ {
    Integer[] heap;
    int n;
    public maxPQ(int cap){
        heap = new Integer[cap+1];
        n=0;
    }
    
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    
    public void insert(int value){
        if(n == heap.length-1){
            /*that means the array is completly
             /* filled and we still wsnt*/
             /* to insert elements in it so we
              /* increase its size*/
            this.resize(2*heap.length);
        }
        n++;
        heap[n] = value;
        swim(n);// this method is used to reheapify the given elment so set it at its correct position
    }
    public void print(){
        for(int i=1;i<=n;i++){
            System.out.print(heap[i]+" ");
        }
    }
    public void swim(int k){// reheapyfy method
        while(k>1 && heap[k/2]<heap[k]){
            // k > 1 as 1 index dosent hsve any parent 
            // heap[k/2] means its parent and in maxPQ we need to hsvr a parents value grester than its child
            //so if not then swap the values to make it good
             int temp = heap[k/2];
             heap[k/2] = heap[k];
             heap[k]=temp;
            k = k/2; //as the newly added element should be also checked with its new parent
        }
    }
    public void resize(int cap){
        Integer[] temp = new Integer[cap];
        for(int i=0;i<heap.length;i++){
            temp[i]=heap[i];
        }
        heap = temp;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        maxPQ mp = new maxPQ(3);
        mp.insert(10);
        mp.insert(1);
        mp.insert(900);
        mp.insert(15);
       mp.print();
    }
    
}