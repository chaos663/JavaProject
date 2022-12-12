package thisex;

class Birthday {
	int day;
	int month;
	int year;

	// 여기서 this는 자기 자신인 위의 year을 가리킨다.
	public void setYear(int year) {
		this.year = year;
	}

	public void printThis() {
		System.out.println(this);
	}

}

public class ThisExample {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();

		System.out.println(b1);
		b1.printThis();

		System.out.println(b2);
		b2.printThis();
	}

}
