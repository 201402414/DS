package H08;

import java.util.*;

public class TestFrequency {
	public static void main(String[] args) {
		new TestFrequency();
	}
	
	public TestFrequency() {
		
		String[] countries = {"KO","DE","ES","FR","DE","ES","DE"};
		List list = Arrays.asList(countries);
		System.out.println("frequency(list, [DE]) : "+frequency(list, "DE"));
		System.out.println("frequency(list, [KO]) : "+frequency(list, "KO"));
		System.out.println("frequency(list, [ES]) : "+frequency(list, "ES"));
		System.out.println("frequency(list, [FR]) : "+frequency(list, "FR"));
	}
	
	int frequency(List list, Object object) {
		int count = 0;
		Iterator it = list.iterator();
		while(it.hasNext()) {
			if(it.next().equals(object)) count++;
		}
		return count;
	}	
}
