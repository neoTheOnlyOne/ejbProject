public class LinkedList {

	Node head;	//head of List

	static class Node {
		Node next;
		int data;

		Node(int d){
			data = d;
			next = null;
		}
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void deleteNode(Node node) {
		if(node.next != null) {
			Node tmpNode = node.next;  // store ref of 4th node to tmp
			node.next = tmpNode.next;  // 3.next = 5th node
			node.data = tmpNode.data;
		}
	}

	public void append(int data) {
		
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		
	}
	
	static void doPrint(Object o) {
		System.out.println(o);
	}
	
}