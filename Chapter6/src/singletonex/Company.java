package singletonex;

public class Company {

	// instance��� �ν��Ͻ��� �� �ϳ��� ����ϱ����ؼ� static���
	private static Company instance = new Company();

	// Constructor
	// private�� �Ἥ �ܺο��� ���� �Ұ�
	private Company() {
	}

	// ��ü�� ���������ʰ� �� �޼��� �θ��� ��� static
	public static Company getInstance() {

		if (instance == null) {
			instance = new Company();
		}
		return instance;
	};

}
