package kr.co.checkpoint;

import java.util.ArrayList;

public class GoodsMethod implements GoodsAble {

	ArrayList<Goods> list = new ArrayList<Goods>();

	@Override
	public int SearchGoods(ArrayList<Goods> list) {
		System.out.println("*[��ǰ �ڵ�]*�� �Է��Ͻÿ� : ");
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
			System.err.println("[��ǰ �ڵ� ����]");
			System.out.println("�ش��ϴ� ��ǰ �ڵ尡 �����ϴ�.");
			return;
		} else {
			System.out.println("\n [ " + list.get(idx).getgName() + " ]\n** �����Ǿ����ϴ�. **\n");
			list.remove(idx);
		}
	}

	@Override
	public void ChangeGoods(ArrayList<Goods> list) {
		ViewGoods(list);
		int idx = SearchGoods(list);
		if (idx == -1) {
			System.err.println("[��ǰ �ڵ� ����]");
			System.out.println("�ش��ϴ� ��ǰ �ڵ尡 �����ϴ�.");
			return;
		} else {
			Goods searchView = list.get(idx);
			System.out.println(searchView);

			System.out.print("������ ");
			System.err.print("*[��ȣ]*");
			System.out.println("�� �����Ͻÿ�.");
			System.out.println("1. �̸� 2. ���� 3. ������");
			int tmp = Integer.parseInt(scan.nextLine().trim());

			switch (tmp) {
			case 1:
				System.out.println("��ǰ�̸� : ");
				String name = scan.nextLine().trim();
				searchView.setgName(name); // �ڵ庣���� ;D
				break;
			case 2:
				System.out.println("��ǰ���� : ");
				int price = Integer.parseInt(scan.nextLine().trim());
				searchView.setgPrice(price);
				break;
			case 3:
				System.out.println("������ : ");
				String make = scan.nextLine().trim();
				searchView.setgMake(make);
				break;
			default:
				System.err.println("***[ �Է� ���� ]***");
				break;
			}
			System.out.println("���� �Ϸ�");
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
		System.out.println("**** �߰��� ��ǰ ���� �Է� ****");
		System.out.println("��ǰ�ڵ� : ");
		String no = scan.nextLine().trim();

		for (int i = 0; i < list.size(); i++) {
			if (no.equals(list.get(i).getgNo())) {
				idx = i;
				System.err.println("[��ǰ �ڵ� �ߺ�]");
				System.out.println("[ " + list.get(idx).getgName() + " ] ��(��) �ڵ尡 �ߺ��˴ϴ�.\n");
				return;
			}
		}

		System.out.println("��ǰ�̸� : ");
		String name = scan.nextLine().trim();
		System.out.println("��ǰ���� : ");
		int price = Integer.parseInt(scan.nextLine().trim());
		System.out.println("������ : ");
		String make = scan.nextLine().trim();

		list.add(new Goods(no, name, price, make));
	}

}
