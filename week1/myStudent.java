package H01;
import java.util.*;
public class myStudent implements Student{
	
	Transcript transcript = new Transcript();
	private String name;
	private int yob;
	private boolean male;
	
	public myStudent(String name, boolean male, int yob) {
		this.name = name;
		this.male = male;
		this.yob = yob;
	}
	public String getName() {
		return name;
	}
	public void updateTranscript(Section section, Grade grade) {
		transcript.add(section, grade);
	}
	public void printTranscript() {
		System.out.println(transcript);
	}
	private class Transcript{
		Map map = new HashMap();
		void add(Section section, Grade grade) {
			map.put(section, grade);
		}
		public String toString() {
			return map.toString();
		}
	}
}
