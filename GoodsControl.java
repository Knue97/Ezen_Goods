/*
 * 1) �ʱ�ȭ�Ͽ� �迭�� ��ǰ 5�� �����
[�޴�]
1.��ǰ�߰� 2.��ǰ���� 3. ��ǰ���� 4.��ǰ���� 5.����
===> ��ǰ �߰�/����/�����ϱ� �� �ִ� ǰ������ Ȯ��

�ʿ��� �޼ҵ�� : ��ǰ �߰��ϱ�, ��ǰ �����ϱ�, ��ǰ �����ϱ�, ��ǰ����, ��ǰ�˻�
 */

//	�ֿܼ� ���� �Է� �޾��� �� ���Է� ������ ��ġ��
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
		init(list); // �ʱ�ȭ

		while (!stop) {

			ViewMenu();
			System.out.println("�޴��� ��ȣ�� �Է��Ͻÿ� : ");
			tmp = Integer.parseInt(scan.nextLine().trim());

			switch (tmp) {
			case 1: // ��ǰ �߰�
				method.addGoods(list);
				break;
			case 2: // ��ǰ ����
				method.ChangeGoods(list);
				break;
			case 3: // ��ǰ ����
				method.DelectGoods(list);
				break;
			case 4: // ��ǰ ����
				method.ViewGoods(list);
				break;
			case 5: // ����
				stop = true;
				break;
			default:
				System.err.println("�Է� ����");
				break;
			}
		} // End of while (true)
		System.out.println("���� ����");
	} // End of Main

	static void init(ArrayList<Goods> list) {

		list.add(new Goods("10001", "��簻", 3000, "�ѱ�"));
		list.add(new Goods("10002", "����", 2000, "�̱�"));
		list.add(new Goods("10003", "Ƽ��̼�", 3400, "��Ż����"));
		list.add(new Goods("10004", "��ī��", 2800, "������"));
		list.add(new Goods("10005", "�㸮��", 2700, "�븸"));
	}

	static void ViewMenu() {
		System.out.println("[  �޴�  ]");
		System.out.println("1. ��ǰ�߰� 2. ��ǰ���� 3. ��ǰ���� 4. ��ǰ���� 5. ����");
		System.out.println("=================================================");

	}

}
