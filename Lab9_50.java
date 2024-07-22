/*
Write a menu driven program to implement following operations on the Queue
using an Array
ENQUEUE
DEQUEUE
DISPLAY
*/

public class Lab9_50{
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(5);
		q.enqueue(15);
		q.enqueue(35);
		q.dequeue();
		q.enqueue(45);
		q.display();
	}
}

class Queue{
	int[] q;
	int f=-1;
	int r=-1;
	int n;
	Queue(int n){
		this.n = n;
		q = new int[n];
	}

	public void enqueue(int x){
		if(r>=n-1){
			System.out.println("Queue overflow");
			return;
		}

		else{
			r++;
			q[r] = x;
			if(f==-1){
				f=0;
			}
		}
	}

	public void dequeue(){
		if(f==-1){
			System.out.println("Queue underflow");
			return;	
		}
// 1 2
		else{
			System.out.println("Element is : "+q[f]);
			if(f == r){
			//System.out.println("Element is : "+q[f]);
				f = -1;
				r = -1;				
			}else{
			f = f + 1;
			}
		}
	}

	public void display(){
		for(int i=f;i<=r;i++){
			System.out.println(q[i]);
		}
	}
}