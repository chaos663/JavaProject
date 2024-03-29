package witharraylist;

public class VipCustomer extends Customer {

	protected int agentID;
	private double saleRatio;

	public VipCustomer() {

		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;

	};

	public VipCustomer(int customerID, String customerName, int agentID) {

		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		this.customerID = customerID;
		this.customerName = customerName;

	};

	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	};

	public int getAgentID() {

		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 그리고 담당 상담원 아이디는 " + agentID + " 입니다.";
	};
	
	

}
