package W02;
import java.util.Scanner;
public class TestNodeSet {
	
	public void run() {
		NodeSet nodeset = new NodeSet();
		Scanner scan = new Scanner(System.in);
		int number, fir, sec;
		String content;
		
		while(true) {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print(" 1 >>> �߰�  \n 2 >>> ���� \n 3 >>> Ȯ�� \n 4 >>> "
					+ "������ �ִ���Ȯ�� \n 5 >>> ���� \n 6 >>> ���� \n  : ");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number == 1) {
				System.out.print("�߰��ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.next();
				nodeset.add(content);
				
			}
			else if(number == 2) {
				System.out.print("������ ���� : ");
				content = scan.next();
				nodeset.remove(content);
			}
			
			else if(number == 3) {
				System.out.println("���������� ������ : ");
				System.out.println(nodeset.checkNode());
				
			}
			else if(number == 4) {
				System.out.print("Ȯ���� ���� : ");
				content = scan.next();
				if(nodeset.contains(content)== true)
					System.out.println("----�ִ�----");
				else System.out.println("----����----");
			}
			else if(number == 5) {
				System.out.println("���� ��ü�� ��ȣ(i, j)�� �Է��ϼ��� : ");
				System.out.print("�ٲ� ��� i �Է� : ");
				fir = scan.nextInt();
				System.out.print("�ٲ� ��� j �Է� : ");
				sec = scan.nextInt();
				if(fir == sec) {
					System.out.println("�Է��� �߸� �Ǿ����ϴ�. ");
				}
				else {
					nodeset.swap(fir, sec);
				}
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