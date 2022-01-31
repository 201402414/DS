package W11;

public class BinaryTree {
	private Object root;
	private BinaryTree right, left;
	
	public BinaryTree(Object root){
		this.root = root;
		this.left = null;
		this.right = null;
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer("[");
		if(left != null) buf.append(left + ",");
		buf.append(root);
		if(right != null) buf.append("," + right);
		return buf + "]";
	}
	
	public Object getRoot(){
		return root;
	}
	
	public Object setRoot(Object root){
		return this.root = root;
	}
	
	public BinaryTree getLeft(){
		return left;
	}
	
	public BinaryTree setLeft(BinaryTree left){
		return this.left = left;
	}
	
	public BinaryTree getRight(){
		return right;
	}
	
	public BinaryTree setRight(BinaryTree right){
		return this.right = right;
	}
	
	public Boolean isBST(){
		if( !(root instanceof Comparable) ) return false;
		Comparable key = (Comparable) root;
		if( this.left != null){
			if( key.compareTo(this.left.getRoot()) < 0) return false;
			else return this.left.isBST();
		}
		if( this.right != null){
			if( key.compareTo(this.right.getRight()) > 0) return false;
			else return this.right.isBST();
		}
		return true;
	}
	
	public void insertKey(Object data){
		if( ((String)root).compareTo((String)data) < 0){
			if(this.right != null){
				right.insertKey(data);
			}
			else{
				this.right = new BinaryTree(data);
			}
		}
		else if( ((String)root).compareTo((String)data) > 0){
			if(this.left != null){
				left.insertKey(data);
			}
			else
				this.left = new BinaryTree(data);
		}
	}
}
