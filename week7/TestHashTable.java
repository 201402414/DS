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
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print(" 1 >>> [Hash] put \n 2 >>> [Hash] get \n 3 >>> ���� \n : ");
			String key,value;
			number = scan.nextInt();
			scan.nextLine();

			if(number == 1) {
				System.out.print("key�� �Է��Ͻÿ� : ");
				key = scan.nextLine();
				System.out.println("������ �Է��ϼ��� : ");
				content1 = scan.nextLine();
				System.out.println("�� �Է��ϼ��� : ");
				content2 = scan.nextLine();
				Country bbb = new Country(content1, content2);
				asdf.put(key, bbb.toString());

			}
			else if (number ==2) {
				System.out.print("key�� �Է��Ͻÿ� : ");
				key = scan.nextLine();
				Object qwer = asdf.get(key);
				
			}
			else if (number == 3) {
				break;
			}
		}

	}
}
