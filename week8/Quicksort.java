package H09;

public class Quicksort {
	private int [] array;
	private int size,i;
	private int maxSize;

	public Quicksort(int size){
		maxSize = size+1;
		array = new int[maxSize];
		this.size = 0;
	}
	public void quickSortRecursively(int left, int right){
		int mid = partition(left,right);
		if(left<mid){quickSortRecursively(left, mid-1);}
		if(right>mid){
			quickSortRecursively(mid+1, right);
		}
	}
	public void sorting(){
		this.quickSortRecursively(0, size-1);
	}
	public int partition(int left, int right){
		int pivot = left;
		int data = this.array[pivot];
		right++;
		do{ do{left++;} while(this.array[left] > data);
			do{right--;}while(this.array[right] < data);
			if(left < right) {this.swap(left, right);}
		} while(left < right);
		this.swap(pivot, right);
		return right;
	}
	public void swap(int a, int b) {
		int aaa;
		aaa = array[a];
		array[a] = array[b];
		array[b] = aaa;
	}
	public  boolean add(int data){
		if(size < maxSize){
			array[size++] = data;
			return true;
		}
		else
			return false;
	}
	public int getFirst() {
		i = 0;
		return array[i];
	}
	public int getNext() {
		return array[++i];
	}
	public int size() {
		return size;
	}
	public void print(){
		System.out.print(this.getFirst()+"");
		for(int i = 0; i < size - 1; i++){
			System.out.print(", "+this.getNext()+"");
		}
		System.out.println();
	}
}
