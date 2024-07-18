/*
Write a program to simulate music player application using suitable data
structure. There is no estimation about number of music files to be managed by
the music player. Your program should support all the basic music player
operations to play and manage the playlist.
*/

public class Lab17_5{
	public static void main(String[] args) {
		DoublyLinkedList d1 = new DoublyLinkedList();
		d1.addmusic("sajni re1");
		d1.addmusic("sajni re2");
		d1.addmusic("sajni re3");
		d1.addmusic("sajni re4");
		d1.addmusic("sajni re5");
		d1.addmusic("sajni re6");
		d1.deleteMusic("sajni re4");
		d1.allMusicName();
		d1.play("sajni re2");
	}
}


class Node{
	String data;
	Node lptr;
	Node rptr;
	Node(String x){
		this.data = x;
	}
}

class DoublyLinkedList{
	Node r = null;
	Node l = null;
	int no;

	public void addmusic(String x){
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

	public void play(String x){
		System.out.println("playing "+x);
	}

	public void allMusicName(){
		Node temp = l;
		while(temp!=null){
			System.out.println(temp.data);
			temp =  temp.rptr;
		}
	}

	public void deleteMusic(String x){
		Node temp = l;
		Node prev = null;
		while(temp!=null){
			if(temp.data == x){
				System.out.println("deleted "+x);
				prev.rptr = temp.rptr;
			}
			prev = temp;
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
}