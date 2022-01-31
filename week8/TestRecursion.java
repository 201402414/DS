package H09;

import java.util.Scanner;

public class TestRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quicksort asdf = new Quicksort(999);
		Scanner scan = new Scanner(System.in);
		int number;
		int content;

		while(true) {
			System.out.println("번호를 입력하세요");
			System.out.print(" 1 >>> [Recursive] add \n 2 >>> [Recursive] sort \n 3 >>> [Recursive] print \n 4 >>> 종료 \n : ");
			String key,value;
			number = scan.nextInt();
			scan.nextLine();

			if(number == 1) {
				System.out.println("추가 하고 싶은 내용을 입력하세요 : ");
				content = scan.nextInt();
				asdf.add(content);
			}
			else if (number ==2) {
				asdf.sorting();
				System.out.println("내림차순으로 정렬 되었습니다  : ");
			}
			else if (number == 3) {
				asdf.print();
			}
			else if (number == 4) {
				System.out.println("종료합니다 ");
				break;
			}
		}
	}
	
}
