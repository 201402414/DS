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
			System.out.println("번호를 입력하세요");
			System.out.print(" 1 >>> [Queue] 내용 추가  \n 2 >>> [Queue] 내용 N개 삭제 \n 3 >>> [Queue] 내용 하나 삭제 \n 4 >>> "
					+ "[Queue] 사이즈출력 \n 5 >>> [Queue] 내용출력 \n 6 >>> [Queue] 첫번째 값 출력  \n 7 >>> 종료  \n : ");

			number = scan.nextInt();
			scan.nextLine();

			if(number == 1) {
				System.out.print("추가하고 싶은 내용을 입력하세요 : ");
				content = scan.next();
				asdf.add(content);

			}
			else if(number == 2) {
				Object st;
				int count=0;
				int count1=0;
				System.out.println("삭제하고 싶은 갯수 : ");
				int a = scan.nextInt();
				for(int i = 0; i < a; i++) {
					if(asdf.size() != 0) {
						st = asdf.remove();
						count ++;
						System.out.println("["+st+"] 가 삭제되었습니다.");}
					else {
						count1++;
					}
					
				}
				if(count1 != 0) {
					System.out.println("데이터가"+a+"개 보다 적어서 "+count+"개만 삭제되었습니다.");}
			}

			else if(number == 3) {
				Object st;
				if(asdf.size() != 0) {
					st = asdf.remove();
					System.out.println("["+st+"] 가 삭제되었습니다.");}
				else {
					System.out.println("지울 데이터가 없습니다.");
				}
			}
			else if(number == 4) {
				System.out.print("사이즈 : ");
				System.out.println(asdf.size());
			}
			else if(number == 5) {
				System.out.print("내용 출력 : ");
				System.out.println(asdf.print());
			}
			else if(number == 6) {
				if(asdf.size() != 0) {
					System.out.println(asdf.peek());
				}
				else {
					System.out.println("데이터가 없습니다.");
				}
			}
			else if(number == 7) {
				System.out.println("종료됩니다.");
				break;
			}
			else {
				break;
			}
		}
	}

}


