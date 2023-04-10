package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
		/*
		Customer customerHulk = new Customer();
		customerHulk.setCustomerID(1001);
		customerHulk.setCustomerName("헐크");
		customerHulk.setCustomerGrade("SILVER");
	*/
		//업캐스팅
		Customer customerIron = new VipCustomer(1002,"아이언맨", 100);
		Customer customerKim = new Customer(1003,"김종국");
		//형변환,묵시적, 하위클래는 상위 클래스의 타입을 내포
		
		customerIron.setBonusPoint(1000);
	

		//System.out.println(customerHulk.showCustomerInfo());
		System.out.println(customerIron.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

	}

}