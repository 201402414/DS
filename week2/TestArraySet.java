package H02;
import java.util.*;

public class TestArraySet {
	public void run() {
		Set set = new ArraySet();
		Scanner scan = new Scanner(System.in);
		int number;
		String content;
		
		while(true) {
			System.out.println("번호를 입력하세요");
			System.out.print(" 1 >>> 추가  \n 2 >>> 삭제 \n 3 >>> 내용확인 \n 4 >>> "
					+ "사이즈 출력 \n 5 >>> 해당 내용이 있는지 확인 \n 6 >>> 종료 \n  : ");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number ==1) {
				System.out.print("추가하고 싶은 내용을 입력하세요 : ");
				content = scan.next();
				if(set.add(content) == true) 
					System.out.println("내용이 중복됩니다.");
				set.add(content);
				
			}
			else if(number == 2) {
				System.out.print("삭제할 내용 : ");
				content = scan.next();
				set.remove(content);
				this.print(set);
			}
			
			else if(number == 3) {
				this.print(set);
			}
			else if(number == 4) {
				System.out.println("사이즈 : " + set.size());
			}
			else if(number == 5) {
				System.out.print("확인할 내용 : ");
				content = scan.next();
				if(set.contains(content)== true)
					System.out.println("----있다----");
				else System.out.println("----없다----");
			}
			else if(number == 6) {
				System.out.println("종료됩니다.");
				break;
			}
			else {
				break;
			}
		}
	}
	public void print(Set set) {
		System.out.println("\n 가방 안에 들어있는 내용입니다.");
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

