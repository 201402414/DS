package H02;
import java.util.*;

public class TestArraySet {
	public void run() {
		Set set = new ArraySet();
		Scanner scan = new Scanner(System.in);
		int number;
		String content;
		
		while(true) {
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.print(" 1 >>> �߰�  \n 2 >>> ���� \n 3 >>> ����Ȯ�� \n 4 >>> "
					+ "������ ��� \n 5 >>> �ش� ������ �ִ��� Ȯ�� \n 6 >>> ���� \n  : ");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number ==1) {
				System.out.print("�߰��ϰ� ���� ������ �Է��ϼ��� : ");
				content = scan.next();
				if(set.add(content) == true) 
					System.out.println("������ �ߺ��˴ϴ�.");
				set.add(content);
				
			}
			else if(number == 2) {
				System.out.print("������ ���� : ");
				content = scan.next();
				set.remove(content);
				this.print(set);
			}
			
			else if(number == 3) {
				this.print(set);
			}
			else if(number == 4) {
				System.out.println("������ : " + set.size());
			}
			else if(number == 5) {
				System.out.print("Ȯ���� ���� : ");
				content = scan.next();
				if(set.contains(content)== true)
					System.out.println("----�ִ�----");
				else System.out.println("----����----");
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
	public void print(Set set) {
		System.out.println("\n ���� �ȿ� ����ִ� �����Դϴ�.");
		System.out.print(set.getFirst());
		for(int i = 1; i<set.size(); i++)
			System.out.print(", " + set.getNext());
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArraySet test = new TestArraySet();
		test.run();
	}
}

