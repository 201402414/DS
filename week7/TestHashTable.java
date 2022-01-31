package H08;

import java.util.Scanner;

public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable asdf = new HashTable(10,0.75F);
		Scanner scan = new Scanner(System.in);
		int number;
		String content1, content2;

		while(true) {
			System.out.println("번호를 입력하세요");
			System.out.print(" 1 >>> [Hash] put \n 2 >>> [Hash] get \n 3 >>> 종료 \n : ");
			String key,value;
			number = scan.nextInt();
			scan.nextLine();

			if(number == 1) {
				System.out.print("key를 입력하시오 : ");
				key = scan.nextLine();
				System.out.println("국가를 입력하세요 : ");
				content1 = scan.nextLine();
				System.out.println("언어를 입력하세요 : ");
				content2 = scan.nextLine();
				Country bbb = new Country(content1, content2);
				asdf.put(key, bbb.toString());

			}
			else if (number ==2) {
				System.out.print("key를 입력하시오 : ");
				key = scan.nextLine();
				Object qwer = asdf.get(key);
				
			}
			else if (number == 3) {
				break;
			}
		}

	}
}
