package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "Java");
		
		StringConcat concat = (s1,s2)-> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "lambda");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + " " + s2);
			}
		};
		
		concat2.makeString("hello", "Kotlin");
		
	}

}
