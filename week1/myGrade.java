package H01;

public class myGrade implements Grade {
	
	private String value;
	
	public myGrade (String value) {
	this.value = value;	
	}
	public String getValue() {
	return value;	
	}
	public String toString() {
		return getValue();
	}
}
