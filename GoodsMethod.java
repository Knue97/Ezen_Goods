package kr.co.checkpoint;

import java.util.ArrayList;

public class GoodsMethod implements GoodsAble {

	ArrayList<Goods> list = new ArrayList<Goods>();

	@Override
	public int SearchGoods(ArrayList<Goods> list) {
		System.out.println("*[상품 코드]*를 입력하시오 : ");
		int idx = -1;
		String code = scan.nextLine().trim();

		for (int i = 0; i < list.size(); i++) {
			if (code.equals(list.get(i).getgNo())) {
				idx = i;
				return idx;
			}
		}
		return idx; // -1
	}

	@Override
	public void DelectGoods(ArrayList<Goods> list) {
		ViewGoods(list);
		int idx = SearchGoods(list);
		if (idx == -1) {
			System.err.println("[상품 코드 오류]");
			System.out.println("해당하는 상품 코드가 없습니다.");
			return;
		} else {
			System.out.println("\n [ " + list.get(idx).getgName() + " ]\n** 삭제되었습니다. **\n");
			list.remove(idx);
		}
	}

	@Override
	public void ChangeGoods(ArrayList<Goods> list) {
		ViewGoods(list);
		int idx = SearchGoods(list);
		if (idx == -1) {
			System.err.println("[상품 코드 오류]");
			System.out.println("해당하는 상품 코드가 없습니다.");
			return;
		} else {
			Goods searchView = list.get(idx);
			System.out.println(searchView);

			System.out.print("변경할 ");
			System.err.print("*[번호]*");
			System.out.println("를 선택하시오.");
			System.out.println("1. 이름 2. 가격 3. 원산지");
			int tmp = Integer.parseInt(scan.nextLine().trim());

			switch (tmp) {
			case 1:
				System.out.println("상품이름 : ");
				String name = scan.nextLine().trim();
				searchView.setgName(name); // 코드베끼기 ;D
				break;
			case 2:
				System.out.println("상품가격 : ");
				int price = Integer.parseInt(scan.nextLine().trim());
				searchView.setgPrice(price);
				break;
			case 3:
				System.out.println("원산지 : ");
				String make = scan.nextLine().trim();
				searchView.setgMake(make);
				break;
			default:
				System.err.println("***[ 입력 오류 ]***");
				break;
			}
			System.out.println("변경 완료");
		}
	}

	@Override
	public void ViewGoods(ArrayList<Goods> list) {
		for (int i = 0; i < list.size(); i++) {
			Goods freeView = list.get(i);
			System.out.println(freeView);
		}
		System.out.println();

	}

	@Override
	public void addGoods(ArrayList<Goods> list) {
		int idx = -1;
		ViewGoods(list);
		System.out.println("**** 추가할 상품 정보 입력 ****");
		System.out.println("상품코드 : ");
		String no = scan.nextLine().trim();

		for (int i = 0; i < list.size(); i++) {
			if (no.equals(list.get(i).getgNo())) {
				idx = i;
				System.err.println("[상품 코드 중복]");
				System.out.println("[ " + list.get(idx).getgName() + " ] 와(과) 코드가 중복됩니다.\n");
				return;
			}
		}

		System.out.println("상품이름 : ");
		String name = scan.nextLine().trim();
		System.out.println("상품가격 : ");
		int price = Integer.parseInt(scan.nextLine().trim());
		System.out.println("원산지 : ");
		String make = scan.nextLine().trim();

		list.add(new Goods(no, name, price, make));
	}

}
