package inheritance;

public class Customer {

	// protected�� �ٸ� ��Ű������ ��ӹ޾Ƶ� ����� �� �ִ�.
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
	 * VIP ��� �߰��ϱ� ! �ܰ���� ���� ������ �ʿ� ��, ��� ���� ���� �ϱ� ���� ������ ���� ������ ��, �� ��� VIP, ��ǰ
	 * ���� �������� 10%, ���ʽ� ����Ʈ�� 5%, ��� ���� ���� ����
	 */
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	};

	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + " �̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
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
