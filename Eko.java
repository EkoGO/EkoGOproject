public class Eko {
	public static void main(String[] args) {
		System.out.println("Eko goobye");

		int a = 10;
		int b = 5;

		System.out.println(plus(a, b) + "");

		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

	private static int plus(int a, int b) {
		return a + b;
	}
}
