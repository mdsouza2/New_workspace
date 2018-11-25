
public class DoublyLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			this.data = d;
			this.next = null;
			this.prev = null;
		}
	}
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = this.head;
		if(this.head!=null)
			this.head.prev = new_node;
		this.head = new_node;
	}
	void insertAfter(Node prev_node, int new_data) {
		Node new_node = new Node(new_data);
		if(prev_node==null) {
			System.out.println("Previous node cannot be null");
			return;
		}
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		if(new_node.next!=null)
			new_node.next.prev = new_node;
	}
	void insertBefore(Node next_node, int new_data) {
		Node new_node = new Node(new_data);
		if(new_node==null)
			return;
		new_node.next = next_node;
		new_node.prev = next_node.prev;
		next_node.prev = new_node;
		if(new_node.prev!=null)
			new_node.prev.next = new_node;
	}
	void append(int new_data) {
		Node new_node = new Node(new_data);
		//new_node.next = null;
		if(this.head==null) {
			this.head = new_node;
			return;}
		Node last = this.head;
		while(last.next!=null) {
			last = last.next;
		}
		new_node.prev = last;
		last.next = new_node;
	}
	void printList() {
		Node temp = this.head;
		System.out.print("Current Doubly Linked List: ");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.append(2);
		dll.printList();
		
		dll.push(1);
		dll.printList();
		
		dll.append(4);
		dll.printList();
		
		dll.insertAfter(dll.head.next, 3);
		dll.printList();
		
		dll.append(6);
		dll.printList();
		
		dll.insertBefore(dll.head.next.next.next.next, 5);
		dll.printList();
	}

}
