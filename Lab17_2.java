public class Lab17_2{
	public static void main(String[] args) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.insertAtLast(10);
		d.insertAtLast(20);
		d.insertAtLast(30);
		d.insertAtLast(50);
		d.insertAtLast(60);
		d.delete(50);
		d.insertAtLast(140);
		d.display();
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
}