public class Lab10_59{
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insertAtLast(5);
		l1.insertAtLast(15);
		l1.insertAtLast(25);
		l1.insertAtLast(53);
		l1.insertAtLast(55);
		l1.insertAtLast(35);
		l1.display();
	    System.out.println();
	    LinkedList l2 = new LinkedList();
		l2.insertAtLast(5);
		l2.insertAtLast(15);
		l2.insertAtLast(25);
		l2.insertAtLast(53);
		l2.insertAtLast(55);
		l2.insertAtLast(35);
		l2.display();
	    
	    Node temp = l1.first;
	    Node temp2 = l2.first;
	    
	    while(temp.link!=null && temp2.link!=null){
	        if(temp.data!=temp2.data){
	            System.out.println("no");
	        }
	        temp = temp.link;
	        temp2 = temp2.link;
	    }
	}

}

class Node{
	int data;
	Node link;
	Node(int data){
		this.data = data;
		this.link = null;
	}
}

class LinkedList{
	Node first;
	public void insertAtFirst(int x){
		Node newNode = new Node(x);

		if(first == null){
			first = newNode;
		}
		else{
			newNode.link = first;
			first = newNode;
		}
	}
	public void insertAtLast(int x){
		Node newNode = new Node(x);
		if(first == null){
			first = newNode;
		}
		else{
			Node temp = first;
			while(temp.link!=null){
				temp = temp.link;
			}
			temp.link = newNode;

		}
	}

	public void insertIntoOrdered(int x){
		Node newNode = new Node(x);
		if(first == null){
			first = newNode;
		}
		else if(first.data>=newNode.data){
			newNode.link = first;
			first = newNode;
		}
// 5 6 7 8 10
		else {
			Node pointer = null;
			Node temp=first;
			while(temp!=null && temp.data<=newNode.data){
				pointer =  temp;
				temp = temp.link;
			}
			pointer.link = newNode;
			newNode.link = temp;
		}

	}

	public void display(){
		Node temp = first;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.link;
		}
	}
	public void deleteFirst(){
		if(first == null){
			System.out.println("Empty linkedlist");
		}
		first = first.link;
	}


	public void deleteLast(){
		if(first == null){
			System.out.println("Empty linkedlist");
		}
		Node temp=first;
		Node previous=null;
		while(temp.link!=null){
			previous=temp;
			temp=temp.link;
		}
		previous.link = null;
	}
//  5 6 7 8
	public void deleteSpecific(int x){
		Node temp=first;
		Node previous=null;
		boolean ispresent=true;
		while(temp!=null){
			if(temp.data==x){
				Node val = temp.link;
				previous.link = val;
				ispresent = true;
			    break;
			}
			previous = temp;
			temp = temp.link;
		}
		if(!ispresent){
			System.out.println("not in there");
		}
	}
    
    public void checkNoOfData(){
        Node temp = first;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.link;
            
        }
        System.out.println();
        System.out.println(c);
    }
}