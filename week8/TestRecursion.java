package H09;

import java.util.Scanner;

public class TestRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quicksort asdf = new Quicksort(999);
		Scanner scan = new Scanner(System.in);
		int number;
		int content;

		while(true) {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print(" 1 >>> [Recursive] add \n 2 >>> [Recursive] sort \n 3 >>> [Recursive] print \n 4 >>> ���� \n : ");
			String key,value;
			number = scan.nextInt();
			scan.nextLine();

			if(number == 1) {
				System.out.println("�߰� �ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.nextInt();
				asdf.add(content);
			}
			else if (number ==2) {
				asdf.sorting();
				System.out.println("������������ ���� �Ǿ����ϴ�  : ");
			}
			else if (number == 3) {
				asdf.print();
			}
			else if (number == 4) {
				System.out.println("�����մϴ� ");
				break;
			}
		}
	}
	
}
