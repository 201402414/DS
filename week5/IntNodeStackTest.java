package H05;

import java.util.Scanner;

public class IntNodeStackTest {
	public void run() {
		IntNodeStack asdf = new IntNodeStack();
		Scanner scan = new Scanner(System.in);
		int number;
		int content;
		
		while(true) {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print(" 1 >>> ���ÿ� ���� �߰�  \n 2 >>> ���ÿ� ���������� ���� ���� ���� \n 3 >>> ���ÿ� ó�� ���� ���� ���� \n 4 >>> "
					+ "��������� \n 5 >>> ������� \n 6 >>> ���� \n  : ");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number == 1) {
				System.out.print("�߰��ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.nextInt();
				asdf.push(content);
				
			}
			else if(number == 2) {
				System.out.println("������ ������ �����մϴ�");
				int a = asdf.pop();
				if(a != -1) {
				System.out.println("["+a+"] �����Ǿ����ϴ�");
				}
				else {
					System.out.println("������ �����Ͱ� ���̻� �����ϴ�.");
				}
			}
			
			else if(number == 3) {
				System.out.println("ó�� ������ �����մϴ�");
				int a = asdf.popBottom();
				if(a != -1) {
				System.out.println(" ["+a+"] �����Ǿ����ϴ�");
				}
				else {
					System.out.println("������ �����Ͱ� ���̻� �����ϴ�.");
				}
			}
			else if(number == 4) {
				System.out.print("������ : ");
				System.out.println(asdf.size());
			}
			else if(number == 5) {
				System.out.println("���� ��� : ");
				System.out.println(asdf.checkNode());
				System.out.println();
			}
			else if(number == 6) {
				System.out.println("����˴ϴ�.");
				break;
			}
			else {
				break;
			}
		}
		}
	
}
