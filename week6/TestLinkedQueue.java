package H06;

import java.util.Scanner;

public class TestLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedQueue asdf = new LinkedQueue();
		Scanner scan = new Scanner(System.in);
		int number;
		Object content;

		while(true) {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print(" 1 >>> [Queue] ���� �߰�  \n 2 >>> [Queue] ���� N�� ���� \n 3 >>> [Queue] ���� �ϳ� ���� \n 4 >>> "
					+ "[Queue] ��������� \n 5 >>> [Queue] ������� \n 6 >>> [Queue] ù��° �� ���  \n 7 >>> ����  \n : ");

			number = scan.nextInt();
			scan.nextLine();

			if(number == 1) {
				System.out.print("�߰��ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.next();
				asdf.add(content);

			}
			else if(number == 2) {
				Object st;
				int count=0;
				int count1=0;
				System.out.println("�����ϰ� ���� ���� : ");
				int a = scan.nextInt();
				for(int i = 0; i < a; i++) {
					if(asdf.size() != 0) {
						st = asdf.remove();
						count ++;
						System.out.println("["+st+"] �� �����Ǿ����ϴ�.");}
					else {
						count1++;
					}
					
				}
				if(count1 != 0) {
					System.out.println("�����Ͱ�"+a+"�� ���� ��� "+count+"���� �����Ǿ����ϴ�.");}
			}

			else if(number == 3) {
				Object st;
				if(asdf.size() != 0) {
					st = asdf.remove();
					System.out.println("["+st+"] �� �����Ǿ����ϴ�.");}
				else {
					System.out.println("���� �����Ͱ� �����ϴ�.");
				}
			}
			else if(number == 4) {
				System.out.print("������ : ");
				System.out.println(asdf.size());
			}
			else if(number == 5) {
				System.out.print("���� ��� : ");
				System.out.println(asdf.print());
			}
			else if(number == 6) {
				if(asdf.size() != 0) {
					System.out.println(asdf.peek());
				}
				else {
					System.out.println("�����Ͱ� �����ϴ�.");
				}
			}
			else if(number == 7) {
				System.out.println("����˴ϴ�.");
				break;
			}
			else {
				break;
			}
		}
	}

}


