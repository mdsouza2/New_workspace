import java.util.*;

public class LinkedList {
	Node head;
	public static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = this.head;
		this.head = new_node;
	}
	void insertAfter(int new_data, Node prev_node) {
		Node new_node = new Node(new_data);
		if(prev_node==null){
			System.out.println("Previous node cannot be null");
			return;
		}
		Node last = this.head;
		while(last.next!=null) {
			if(last.data==prev_node.data)
				break;
			else {
				last = last.next;
			}
		}
		if(last.next==null) {
			System.out.println("Previous node does not exist!");
			return;
		}
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	void append(int new_data) {
		Node new_node = new Node(new_data);
		if(this.head==null) {
			this.head = new_node;
			return;
		}
		Node temp = this.head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = new_node;
	}
	void deleteNode(int key) {
		Node temp = this.head;
		if(temp!=null) {
			if(temp.data==key) {
				this.head=temp.next;
				temp = null;
			}
		}
		Node prev = null;
		while(temp!=null) {
			if(temp.data==key)
				break;
			prev = temp;
			temp = temp.next;
			}
		if(temp==null) {
			System.out.println("Key not present in list");
			return;}
		prev.next= temp.next;
		temp = null;
	}
	void printList() {
		Node temp = this.head;
		System.out.print("Current linked list:");
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.append(6);
		llist.printList();
		
		llist.push(7);
		llist.printList();
		
		llist.push(1);
		llist.printList();
		
		llist.append(4);
		llist.printList();
		
		llist.insertAfter(8, llist.head);
		llist.printList();
		
		llist.deleteNode(4);
		llist.printList();
	}
}