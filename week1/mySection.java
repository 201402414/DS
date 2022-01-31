package H01;

public class mySection implements Section{
	
	private String id;
	
	public mySection(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public String toString() {
		return getId();
	}
	
}
