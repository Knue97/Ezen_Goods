/*
 * 1) 초기화하여 배열에 상품 5개 등록함
[메뉴]
1.상품추가 2.상품수정 3. 상품삭제 4.상품보기 5.종료
===> 상품 추가/수정/삭제하기 전 있는 품목인지 확인

필요한 메소드들 : 상품 추가하기, 상품 수정하기, 상품 삭제하기, 상품보기, 상품검색
 */

//	콘솔에 문자 입력 받았을 떄 재입력 나오게 고치기
package kr.co.checkpoint;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsControl {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		GoodsMethod method = new GoodsMethod();

		boolean stop = false;
		int tmp = -1;
		init(list); // 초기화

		while (!stop) {

			ViewMenu();
			System.out.println("메뉴의 번호를 입력하시오 : ");
			tmp = Integer.parseInt(scan.nextLine().trim());

			switch (tmp) {
			case 1: // 상품 추가
				method.addGoods(list);
				break;
			case 2: // 상품 변경
				method.ChangeGoods(list);
				break;
			case 3: // 상품 삭제
				method.DelectGoods(list);
				break;
			case 4: // 상품 보기
				method.ViewGoods(list);
				break;
			case 5: // 종료
				stop = true;
				break;
			default:
				System.err.println("입력 오류");
				break;
			}
		} // End of while (true)
		System.out.println("완전 종료");
	} // End of Main

	static void init(ArrayList<Goods> list) {

		list.add(new Goods("10001", "밤양갱", 3000, "한국"));
		list.add(new Goods("10002", "나쵸", 2000, "미국"));
		list.add(new Goods("10003", "티라미수", 3400, "이탈리아"));
		list.add(new Goods("10004", "마카롱", 2800, "프랑스"));
		list.add(new Goods("10005", "펑리수", 2700, "대만"));
	}

	static void ViewMenu() {
		System.out.println("[  메뉴  ]");
		System.out.println("1. 상품추가 2. 상품수정 3. 상품삭제 4. 상품보기 5. 종료");
		System.out.println("=================================================");

	}

}
