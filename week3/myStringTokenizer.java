package H03;

public class myStringTokenizer {
	
	private String[] words;
	private String line = "";
	private String token = "";
	private int index;
	
	public myStringTokenizer(String line, String token) {   
		this.line = line;
		this.token = token;
		this.words = makeWords(line, token);
		this.index = 0;
	}
	public String[] makeWords(String line, String token) {
		String[] tmp = null;
		int split_index = 0;
		int split_length = 1;
		int begin_index = 0;
		int last_index = 0;
		
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == ' ') {
				split_length++;
			}
		}
		tmp = new String[split_length];
		
		for(int i = 0; i < line.length(); i++) {
			if(split_length == (split_index+1)) {
				tmp[split_index] = line.substring(begin_index, line.length());
			}
			else if (line.charAt(i)== ' ') {								// 배열에 공백이 발견 되었을 시  begin 부터 i전까지 짤라준다
				tmp[split_index++] = line.substring(begin_index, i);		// 그리고 다음 단어를 자르기 위해 begin_index를 i+1로 재설정한다.
				begin_index = i+1;
			}
		}
		return tmp;             
	}
	public boolean hasMoreTokens() { // 토큰이 남아있으면 trun 아니면 false
		if(index == words.length) {  // index 가  words배열의 크기와 같아지면 더이상의 토큰이 없으므로 false로 반환 아니면 true로 반환
			return false;
		}
		else {
			return true;
		}
	}
	public String nextToken() { // 다음 토큰은 반환하기 위해 words배열 [index++]를 리턴한다. 
		return words[index++];
	}
}
