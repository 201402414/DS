package H02;
public class ArraySet implements Set {
	
	private Object[] objects = new Object[1000];
	private int size, i;
	
	public boolean add(Object object) {
		for(int i = 0; i<size; i++)
			if(objects[i].equals(object)) return true;
			objects[size++] = object;
		return false;
	}
	public boolean contains(Object object) {
		for(int i = 0; i<size; i++)
			if(objects[i].equals(object)) return true;
		return false;
	}
	public Object getFirst() {
		i = 0;
		return objects[i++];
	}
	public Object getNext() {
		return objects[i++];
	}
	public boolean remove(Object object) {
		for(int i=0; i<size; i++)
			if(objects[i].equals(object)) {
				System.arraycopy(objects, i+1, objects, i, size-i-1);
				objects[--size] = null;
				return true;
			}
		return false;
	}
	public int size() {
		return size;
	}
}
