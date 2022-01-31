package H03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Test {

	public void Test(String file) {
		int words = 0, chars = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			while(line != null) {
				myStringTokenizer parser = new myStringTokenizer(line," ");
				while(parser.hasMoreTokens()) {
					++words;
					String word = parser.nextToken().toUpperCase();  // word 배열에 넣는거
					chars += word.length();
				}
				line = in.readLine();
			}
			in.close();
		}catch(IOException e) {System.out.println(e); }
		System.out.println("words : " + words);
		System.out.println("characters : " + chars);
	}
}
