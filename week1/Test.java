package H01;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String name, grade1, grade2, id1, id2;
		
		System.out.print("이름을 입력하세요 : ");
		name = input.nextLine();
		System.out.print("과목명1을 입력하세요 : ");
		id1 = input.nextLine();
		System.out.print("학점1을 입력하세요 : ");
		grade1 = input.nextLine();
		System.out.print("과목명2을 입력하세요 : ");
		id2 = input.nextLine();
		System.out.print("학점2을 입력하세요 : ");
		grade2 = input.nextLine();
		
		Student a = new myStudent(name,true,1995); //
		Grade b1 = new myGrade(grade1);
		Section c1 = new mySection(id1);
		Grade b2 = new myGrade(grade2);
		Section c2 = new mySection(id2);
		
		System.out.println();
		
		System.out.println(a.getName());
		
		a.updateTranscript(c1, b1); //student 클래스의 updateTranscript 에 객체를 통해 각각 넣었고
		a.updateTranscript(c2, b2);
		a.printTranscript(); // student 클래스의 printTranscript를 이용해 출력을 한다.
	}
}
