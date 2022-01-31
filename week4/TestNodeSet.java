package W02;
import java.util.Scanner;
public class TestNodeSet {
	
	public void run() {
		NodeSet nodeset = new NodeSet();
		Scanner scan = new Scanner(System.in);
		int number, fir, sec;
		String content;
		
		while(true) {
			System.out.println("번호를 입력하세요");
			System.out.print(" 1 >>> 추가  \n 2 >>> 삭제 \n 3 >>> 확인 \n 4 >>> "
					+ "내용이 있는지확인 \n 5 >>> 스왑 \n 6 >>> 종료 \n  : ");
			
			number = scan.nextInt();
			scan.nextLine();
			
			if(number == 1) {
				System.out.print("추가하고 싶은 내용을 입력하세요 : ");
				content = scan.next();
				nodeset.add(content);
				
			}
			else if(number == 2) {
				System.out.print("삭제할 내용 : ");
				content = scan.next();
				nodeset.remove(content);
			}
			
			else if(number == 3) {
				System.out.println("현제까지의 데이터 : ");
				System.out.println(nodeset.checkNode());
				
			}
			else if(number == 4) {
				System.out.print("확인할 내용 : ");
				content = scan.next();
				if(nodeset.contains(content)== true)
					System.out.println("----있다----");
				else System.out.println("----없다----");
			}
			else if(number == 5) {
				System.out.println("서로 교체할 번호(i, j)를 입력하세요 : ");
				System.out.print("바꿀 노드 i 입력 : ");
				fir = scan.nextInt();
				System.out.print("바꿀 노드 j 입력 : ");
				sec = scan.nextInt();
				if(fir == sec) {
					System.out.println("입력이 잘못 되었습니다. ");
				}
				else {
					nodeset.swap(fir, sec);
				}
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