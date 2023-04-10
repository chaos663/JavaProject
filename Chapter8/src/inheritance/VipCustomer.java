package inheritance;

public class VipCustomer extends Customer {

	protected int agentID;
	private double saleRatio;
	
	public VipCustomer() {
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
//		System.out.println("VipCustomer() 생성자 호출");
		
	};

	public VipCustomer(int customerID, String customerName,int agentID) {
		
		super(customerID,customerName);
		//super();예약어는 하위클래스가 상위클래스에 접근하기 위한 주소를 가지고 있다는 의미
		
		//super는 자기의 상위 클래스를 가리키는 참조자를 가지고있는 키워드
		//현재 매개변수가 없기에 default constructor를 호출한다. 상위의 Customer();가 호출이 되겠지??
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
//		System.out.println("VipCustomer(int, String) 호출");
	};
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	};
	

	public int getAgentID() {

		return agentID;
	};

}
