package H01;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String name, grade1, grade2, id1, id2;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = input.nextLine();
		System.out.print("�����1�� �Է��ϼ��� : ");
		id1 = input.nextLine();
		System.out.print("����1�� �Է��ϼ��� : ");
		grade1 = input.nextLine();
		System.out.print("�����2�� �Է��ϼ��� : ");
		id2 = input.nextLine();
		System.out.print("����2�� �Է��ϼ��� : ");
		grade2 = input.nextLine();
		
		Student a = new myStudent(name,true,1995); //
		Grade b1 = new myGrade(grade1);
		Section c1 = new mySection(id1);
		Grade b2 = new myGrade(grade2);
		Section c2 = new mySection(id2);
		
		System.out.println();
		
		System.out.println(a.getName());
		
		a.updateTranscript(c1, b1); //student Ŭ������ updateTranscript �� ��ü�� ���� ���� �־���
		a.updateTranscript(c2, b2);
		a.printTranscript(); // student Ŭ������ printTranscript�� �̿��� ����� �Ѵ�.
	}
}
