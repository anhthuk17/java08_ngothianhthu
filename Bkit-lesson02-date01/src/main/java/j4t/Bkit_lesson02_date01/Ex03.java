package j4t.Bkit_lesson02_date01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("Nhập một số bất kỳ:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		Symmetric(a);

	}

	public static void Symmetric(int x) {
		if (x <= 0) {
			System.out.println("Nhập lại: ");

		} else

		{
			int y = 0;
			int tmp = x;
			while (tmp > 0) {
				y = y * 10 + tmp % 10;
				tmp = tmp / 10;

			}

			if (y == x)
				System.out.println(x + " là số đối xứng");
			else
				System.out.println(x + " không là số đối xứng");
		}

	}

}
