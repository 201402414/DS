package H05;

import java.util.Scanner;

public class IntNodeStackTest {
	public void run() {
		IntNodeStack asdf = new IntNodeStack();
		Scanner scan = new Scanner(System.in);
		int number;
		int content;
		
		while(true) {
			System.out.println("번호를 입력하세요");
			System.out.print(" 1 >>> 스택에 내용 추가  \n 2 >>> 스택에 마지막으로 들어온 내용 삭제 \n 3 >>> 스택에 처음 들어온 내용 삭제 \n 4 >>> "
					+ "사이즈출력 \n 5 >>> 내용출력 \n 6 >>> 종료 \n  : ");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number == 1) {
				System.out.print("추가하고 싶은 내용을 입력하세요 : ");
				content = scan.nextInt();
				asdf.push(content);
				
			}
			else if(number == 2) {
				System.out.println("마지막 스택을 삭제합니다");
				int a = asdf.pop();
				if(a != -1) {
				System.out.println("["+a+"] 삭제되었습니다");
				}
				else {
					System.out.println("삭제할 데이터가 더이상 없습니다.");
				}
			}
			
			else if(number == 3) {
				System.out.println("처음 스택을 삭제합니다");
				int a = asdf.popBottom();
				if(a != -1) {
				System.out.println(" ["+a+"] 삭제되었습니다");
				}
				else {
					System.out.println("삭제할 데이터가 더이상 없습니다.");
				}
			}
			else if(number == 4) {
				System.out.print("사이즈 : ");
				System.out.println(asdf.size());
			}
			else if(number == 5) {
				System.out.println("내용 출력 : ");
				System.out.println(asdf.checkNode());
				System.out.println();
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
	
}
