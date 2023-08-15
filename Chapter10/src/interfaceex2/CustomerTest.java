package interfaceex2;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		/*
		customer를 buyer라는 인터페이스에 대입하면 Buy의 인터페이스의 method만 사용가능
		Sell도 똑같음
		*/
		Buy buyer = customer;
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		
		//아래에서 order method를 부르면, customer의 overriding된 method가 불린다.
		customer.order();
		buyer.order();
		seller.order();
			
	}

}
