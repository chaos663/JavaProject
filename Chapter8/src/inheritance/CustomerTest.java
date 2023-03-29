package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerHulk = new Customer();
		customerHulk.setCustomerID(1001);
		customerHulk.setCustomerName("��ũ");
		customerHulk.setCustomerGrade("SILVER");

		Customer customerIron = new Customer();
		customerIron.setCustomerID(1002);
		customerIron.setCustomerName("���̾��");
		customerIron.setCustomerGrade("VIP");
		customerIron.setBonusPoint(10);

		System.out.println(customerHulk.showCustomerInfo());
		System.out.println(customerIron.showCustomerInfo());

	}

}
