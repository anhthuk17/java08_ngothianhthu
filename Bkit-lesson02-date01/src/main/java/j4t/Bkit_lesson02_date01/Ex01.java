package j4t.Bkit_lesson02_date01;

public class Ex01 {
	public static void main(String[] args) {
		int[] a = { 5, 9, 8 };
		Sort(a);
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
		}

	}

	public static void Sort(int b[]) {
		int tmp;
		for (int i = 0; i < 2; i++)
			for (int j = i + 1; j <= 2; j++) {
				if (b[j] < b[i]) {
					tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
				}
			}
	}

}
