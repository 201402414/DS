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
			else if (line.charAt(i)== ' ') {								// �迭�� ������ �߰� �Ǿ��� ��  begin ���� i������ ©���ش�
				tmp[split_index++] = line.substring(begin_index, i);		// �׸��� ���� �ܾ �ڸ��� ���� begin_index�� i+1�� �缳���Ѵ�.
				begin_index = i+1;
			}
		}
		return tmp;             
	}
	public boolean hasMoreTokens() { // ��ū�� ���������� trun �ƴϸ� false
		if(index == words.length) {  // index ��  words�迭�� ũ��� �������� ���̻��� ��ū�� �����Ƿ� false�� ��ȯ �ƴϸ� true�� ��ȯ
			return false;
		}
		else {
			return true;
		}
	}
	public String nextToken() { // ���� ��ū�� ��ȯ�ϱ� ���� words�迭 [index++]�� �����Ѵ�. 
		return words[index++];
	}
}
