package thisex;

class Person {
	String name;
	int age;

	public Person() {
//		int i = 0;
		// �׷��� �� �տ��� �ƹ� statement�� ����!
		this("�̸�����", 1);
		// �̷��� �ٸ� constructor�� ȣ���Ͽ� ����� ���� �տ� ��� statement(����)�� �� �� ����.! �� this�� ���� ����
		// ������ statement!
	}
	// �� ����Ʈ �����ڴ� �Ķ���͸� �޴� �����ڸ� ��� �޾Ƽ� ����� �� �ִ�. == constructor overloading

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Person returnSelf() {
		return this;
		// ��ȯ�ϴ� ���� ���� �νĵǾ��ִ� instance�� �ּ� ��

	}

}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.returnSelf());
	}
}
