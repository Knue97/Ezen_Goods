/*
 [��ǰ����]
- ��ǰ��ȣ, ��ǰ��, ����, ��������
 ->gNo, gName, gPrice, gMake
->������ 4���ʵ� �ۼ�
 ->getter/setter�ۼ�
  toString()�ۼ�
  
 */
package kr.co.checkpoint;

public class Goods {
	private String gNo;
	private String gName;
	private int gPrice;
	private String gMake;

	public Goods() {
	}

	public Goods(String gNo, String gName, int gPrice, String gMake) {
		super();
		this.gNo = gNo;
		this.gName = gName;
		this.gPrice = gPrice;
		this.gMake = gMake;
	}

	// ������� �ټ���
	public String getgNo() {
		return gNo;
	}

	public void setgNo(String gNo) {
		this.gNo = gNo;
	}

	public int getgPrice() {
		return gPrice;
	}

	public void setgPrice(int gPrice) {
		this.gPrice = gPrice;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgMake() {
		return gMake;
	}

	public void setgMake(String gMake) {
		this.gMake = gMake;
	}

	@Override
	public String toString() {
		return "��ǰ ���� [ ��ǰ �ڵ� = " + gNo + ", ��ǰ �̸� = " + gName + ", ��ǰ ���� = " + gPrice + "�� , ������ = " + gMake + " ]";
	}

}
