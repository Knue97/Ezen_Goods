package kr.co.checkpoint;

import java.util.ArrayList;
import java.util.Scanner;


public interface GoodsAble {
	static Scanner scan = new Scanner(System.in);
//	public abstract »ý·«
	int SearchGoods(ArrayList<Goods> list);

	void DelectGoods(ArrayList<Goods> list);

	void ChangeGoods(ArrayList<Goods> list);

	void ViewGoods(ArrayList<Goods> list);

	void addGoods(ArrayList<Goods> list); // throws Exception
}
