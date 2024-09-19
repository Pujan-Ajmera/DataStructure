import java.util.Scanner;

public class Lab_17_88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashTable h = new HashTable();
        for(int i=0;i<15;i++){
            int value = (int)(Math.random()*899999+100000);
            int index=h.hashFunction(value);
            h.linearProbing(index,value);
        }
        for(int i=0;i<20;i++){
            if(h.arr[i]!=0){
            System.out.println(h.arr[i]);
            }
            else{
                System.out.println("NULL");
            }
        }
    }    
}
class HashTable{
    int[] arr;
    public HashTable(){
        arr = new int[20];
    }
    int hashFunction(int x){
        return x%18+2;
    }
    void linearProbing(int index,int value){
        while(arr[index]!=0){
        index=(index+1)%20;
        }
        arr[index] = value;
    }
}
