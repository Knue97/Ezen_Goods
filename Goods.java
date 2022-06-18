/*
 [상품정보]
- 상품번호, 상품명, 가격, 제조국가
 ->gNo, gName, gPrice, gMake
->생성자 4개필드 작성
 ->getter/setter작성
  toString()작성
  
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

	// 여기부터 겟셋즈
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
		return "상품 정보 [ 상품 코드 = " + gNo + ", 상품 이름 = " + gName + ", 상품 가격 = " + gPrice + "원 , 원산지 = " + gMake + " ]";
	}

}
