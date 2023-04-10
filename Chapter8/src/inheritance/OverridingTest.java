 package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		/*	
		Customer customerLee = new Customer(2001,"LEE");
		int price = customerLee.calPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerLee.showCustomerInfo());
		
		System.out.println("#########################");
		
		VipCustomer customerKim = new VipCustomer(1006,"KIM",111);
		
		price = customerKim.calPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerKim.showCustomerInfo());
		
		*/
		
		Customer customerWho = new VipCustomer(10010,"Who",10);
		int price = customerWho.calPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerWho.showCustomerInfo());
		//Customer class 의 price가 호출되는 것이 아니고,VipCustomer에서 overriding한 price 함수가 호출된다.
		//Java에서 대부분의 함수는 이렇게 가상 메서드를 사용한다. 즉, 인스턴스에서 재정의한 함수가 호출되는 것!	
	}

}
 