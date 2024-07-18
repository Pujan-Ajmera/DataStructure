/* WAP to split a circular linked list into two halves */
public class Lab17_4{
	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.insertAtLast(10);
		d.insertAtLast(110);
		d.insertAtLast(120);
		d.insertAtLast(12021);
		d.insertAtLast(1330);
		d.insertAtLast(1202);
		d.insertAtLast(101);
		d.countNodes();
		d.splitTwo();
	}
}

class Node{
	int data;
	Node lptr;
	Node rptr;
	Node(int x){
		this.data = x;
	}
}

class DoublyLinkedList{
	Node r = null;
	Node l = null;
	int no;
	public void insertAtFirst(int x){
		Node newNode = new Node(x);
		if(r == null){
			newNode.lptr = null;
			newNode.rptr = null;
			r = l = newNode;
			return;
		}
		else{
			newNode.lptr = null;
			newNode.rptr = l;
			l.lptr = newNode;
			l = newNode;
			return;
		}
	}

	public void insertAtLast(int x){
		Node newNode = new Node(x);
		if(r == null){
			newNode.lptr = null;
			newNode.rptr = null;
			r = l = newNode;
			return;
		}
		else{
			newNode.lptr = r;
			newNode.rptr = null;
			r.rptr = newNode;
			r = newNode;
			return;
		}
	}

	public void display(){
		Node temp = l;
		while(temp!=null){
			System.out.println(temp.data);
			temp =  temp.rptr;
		}
	}

	public void delete(int x){
		Node temp = l;
		Node prev = null;
		while(temp!=null){
			if(temp.data == x){
				prev.rptr = temp.rptr;
			}
			prev = temp;
			temp = temp.rptr;
		}
	}
// 1 2 3 4  -> 1 3
	public void deleteAlternate(){
		Node temp = l;

		while(temp.rptr!=null){
			temp.rptr = temp.rptr.rptr;
			temp = temp.rptr;
		}
	}


	public void countNodes(){
		Node temp = l;
		int i = 0;
		while(temp!=null){
			i++;
			temp =  temp.rptr;	
		}
		no = i;
	}

	public void splitTwo(){
		Node temp  = l;
		for(int i=1;i<=no/2;i++){
			System.out.print(temp.data+" ");
			temp = temp.rptr;
		}

		for(int i=no/2;i<no;i++){
			System.out.println(temp.data+"   ");
			temp = temp.rptr;
		}

	}

}