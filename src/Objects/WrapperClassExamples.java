package Objects;

public class WrapperClassExamples {

	public static void main(String[] args) {
		Integer firstInteger = new Integer(10);
		Double firstDouble = new Double(5.5);
		Integer secondInteger = 20;
		Double secondDouble = 2.5;
		int total = firstInteger + secondInteger;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("Second integer: " + secondInteger);
		System.out.println("Second double: " + secondDouble);
		System.out.println(total);
	}

}
