package W02;
import java.util.*;
public class NodeSet implements Set{
	
	private Node head;
	private int size;
	private Node end;
	
	public NodeSet() {
		this.head = null;
		this.size = 0;
	}
	public boolean add(String data) {
		if(!this.contains(data)) {
			Node newNode = new Node(data);
			newNode.setNext(this.head);
			this.head = newNode;
			this.size++;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean remove(String data) {
		Node previousNode = null;
		Node currentNode = this.head;
		boolean found = false;
		
		while(currentNode != null && ! found) {
			if(currentNode.getData().equals(data)) {
				found = true;
			}
			else {
				previousNode = currentNode;
				currentNode = currentNode.getNext();
			}
		}
		if(!found) {
			return false;
		}
		else {
			if(currentNode == this.head) {
				this.head = this.head.getNext();
			}
			else {
				previousNode.setNext(currentNode.getNext());
			}
			this.size--;
			return true;
		}
	}
	public boolean contains(String data) {
		Node searchNode = this.head;
		while(searchNode != null) {
			if(searchNode.getData().equals(data)) {
				return true;
			}
			searchNode = searchNode.getNext();
		}
		return false;
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
	public boolean swap(int i, int j) {
		Node temp = this.head;
		Node temp1 = this.head;
		String d1 = " ",d2 =" ";
		if(i == j) {
			return false;
		}
		else {
			for(int a = 0; a<i-1; a++) {
				temp = temp.getNext();
			}
			d1 = temp.getData();
			for(int a = i ; a<j; a++) {
				temp = temp.getNext();
			}
			d2 = temp.getData();
			for(int a = 0; a<i-1; a++) {
				temp1 = temp1.getNext();
			}
			temp1.setData(d2);
			for(int a = i; a<j; a++) {
				temp1 = temp1.getNext();
			}
			temp1.setData(d1);
			
			
		}
		return true;
	}
	public void test() {
		
	}
	public int size() {
		return size;
	}
}
