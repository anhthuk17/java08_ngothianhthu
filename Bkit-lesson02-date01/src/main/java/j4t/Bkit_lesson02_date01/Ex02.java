package j4t.Bkit_lesson02_date01;

public class Ex02 {

	public static void main(String[] args) {

		long sum = Factorial(7) + Factorial(12) + Factorial(4) + Factorial(18);
		System.out.println(sum);
	}

	public static long Factorial(int a) {
		long mun = 1;
		for (int i = 1; i <= a; i++) {
			mun = mun * i;
		}
		return mun;

	}

}
