package j4t.Bkit_lesson02_date01;

public class Ex06 {
	public static void main(String[] args) {
		int dem = 0;
		for (int a = 0; true; a++) {
			if (Prime(a) == true) {
				dem++;
				if (dem == 200) {
					System.out.println(a);
					break;
				}

			}
		}

	}

	public static boolean Prime(int number) {

		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++)
			if (number % i == 0) {
				return false;

			}
		return true;

	}
}