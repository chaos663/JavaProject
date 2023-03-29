package inheritance;

public class Customer {

	// protected는 다른 패키지에서 상속받아도 사용할 수 있다.
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer() {

		customerGrade = "SILVER";
		bonusRatio = 0.01;

	};
	/*
	 * public Customer(int customerID, String customerName) {
	 * 
	 * this.customerID = customerID; this.customerName = customerName; customerGrade
	 * = "SILVER"; bonusRatio = 0.01; };
	 */

	/*
	 * VIP 등급 추가하기 ! 단골고객에 대한 혜택이 필요 함, 우수 고객을 관리 하기 위해 다음과 같은 혜택을 줌, 고객 등급 VIP, 제품
	 * 구매 할인율은 10%, 보너스 포인트는 5%, 담당 전문 상담원 배정
	 */
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	};

	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	};

}
