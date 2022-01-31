package H06;

public class LinkedQueue {
	private Node head = new Node();
	private int size;

	public void add(Object object) {

		if(size == 0) {
			Node newnode= new Node(object,head,head);
			head.setPrev(newnode);
			head.setNext(newnode);
			size++;
		}
		else {
			Node newnode= new Node(object, head.getPrev(), head);
			head.getPrev().setNext(newnode);
			head.setPrev(newnode);
			size++;
		}
	}
	public Object peek() {
		if(this.size != 0) 
			return head.getNext().getData();
		else {
			return head;
		}
	}
	public int size() {
		return size;
	}
	public Node getHead() {
		return head;
	}
	public Object remove() {
		Object a;
		a = head.getNext().getData();
		head.setNext(head.getNext().getNext());
 
		size--;
		return a;
	}
	public String print() {
		String content = "";
		Node searchNode = this.head.getNext();

		while(searchNode != null) {

			content = content + searchNode.getData();
			content = content + " ";
			searchNode = searchNode.getNext();
		}
		return content;
	}
}
