public class Lab13_1{
	public static void main(String[] args) {
		CircularLinkedList c1 = new CircularLinkedList();
		c1.insertAtLast(10);
		c1.insertAtLast(11);
		c1.insertAtLast(12);
		c1.insertAtLast(13);
		c1.insertAtLast(15);
		c1.insertAtLast(123);
		c1.delete(13);
		c1.display();
	}
}

class CircularLinkedList{
	public Node first = null;
	public Node last = null;
	
	public void insertAtFirst(int x){
		Node newNode = new Node(x);
		if(first == null){
			newNode.link = newNode;
			first = newNode;
			last = newNode;
			return;
		}
		else{
			newNode.link = first;
			last.link = newNode;
			first = newNode;
		}
	}


	public void insertAtLast(int x){
		Node newNode = new Node(x);
		if(true){

		}
		else{
			newNode.link = first;
			last.link = newNode;
			last = newNode;
		}
	}


	public void display(){
		Node temp = first;
		do{
			System.out.println(temp.data);
			temp = temp.link;
		}while(temp!=first);
	}

	public void delete(int x){
		Node temp = first;
		Node prev = null;
		if(first == null){
			first = first.link;
		}
		do{
			if(temp.data == x){
				prev.link = temp.link;
				break;
			}
			prev= temp;
			temp = temp.link;
		}while(temp!=first);
	}
}

class Node{
	int data;
	Node link;

	Node(int data){
		this.data = data;
	}
}