package assignment;

public class SLinkList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int nodeElement) {

			data = nodeElement;
			next = null;

		}
	}

	public void traverse(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void insertNode(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	void deleteNode(int key) {
		Node temp = head, prev = null;

		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;
		prev.next = temp.next;
	}

	void display() {
		Node tnode = head;
		while (tnode != null) {
			System.out.println(tnode.data + "");
			tnode = tnode.next;
		}
	}
	/*
	 * public static void main (String args[]) {
	 * 
	 * SLinkList obj = new SLinkList();
	 * 
	 * obj.insertNode(2); obj.insertNode(7); obj.insertNode(10); obj.insertNode(1);
	 * System.out.println("created Link list is:"); obj.display();
	 * 
	 * obj.traverse(null); System.out.println("traverse complete:"); obj.display();
	 * 
	 * obj.deleteNode(2);
	 * System.out.println("After deletion of 2, Linklist would be :");
	 * obj.display();
	 * 
	 * }
	 */
}
//Note: if we get head pointer we can traverse whole linked list.