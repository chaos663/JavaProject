package inheritance;

public class GoldCustomer extends Customer {
	
	//에너테이션 == 컴파일러에 어떠한 역할을 하는지 알려주는 것
	
	
	public GoldCustomer() {
		bonusRatio = 0.05;
	};
	
	@Override
	public int calPrice(int price) {
		// TODO Auto-generated method stub
		return super.calPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}
	
	

}
