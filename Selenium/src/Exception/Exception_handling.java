package Exception;

public class Exception_handling {

	public static void main(String[] args) {

		int A = 10;

		try {
			int result = A / 0;
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("invalid character");

		}

	}

}
