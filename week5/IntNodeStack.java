package H05;

public class IntNodeStack implements IntStack{
	private Node head;
	private int size;
	
	public IntNodeStack() {
		this.head = null;
		this.size = 0;
	}
	public boolean isEmpty() {
		return (size == 0);
	}
	public int pop() {
		if(size ==0)
			return -1;
		int n = this.head.getData();
		this.head = this.head.getNext();
		this.size--;
		return n;
	}
	public int popBottom() {
		Node temp = null;
		Node temp1 = this.head;
		if(this.size >1) {
			for(int i = 1 ; i < this.size; i ++) {
				temp = temp1;
				temp1 = temp1.getNext(); 
			}
			int n = temp1.getData();
			temp.setNext(null);
			this.size--;
			return n;
		}
		else {
			if(size ==0) {
				return -1;
				}
			int n = this.head.getData();
			this.head = this.head.getNext();
			this.size--;
			return n;
		}
		
	}
	public void push(int n) {
		Node newNode = new Node(n);
		newNode.setNext(this.head);
		this.head = newNode;
		this.size++;
	}
	public int size() {
		return size;
	}
	public String checkNode() {
		String content = "";
		Node searchNode = this.head;
		while(searchNode != null) {
			content = content + searchNode.getData();
			content = content + " ";
			searchNode = searchNode.getNext();
		}
		return content;
	}
}
