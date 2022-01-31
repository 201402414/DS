package H06;

public class Node {
	private Object data;
	private Node next;
	private Node prev;

	public Node() {

	}
	public Node(Object data) {
		this.data = data;
		this.next = null;
	}
	public Node(Object data, Node prev, Node next) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	public Object getData() {
		return data;
	}
	public Node getPrev() {
		return prev;
	}
	public Node getNext() {
		return next;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
