package j4t.Bkit_lesson02_date01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Nhập vào một số thập phân : ");
		Scanner scanners = new Scanner(System.in);
		int a = scanners.nextInt();
		Convert(a);
	}

	public static void Convert(int x) {
		int b = 0;
		int A[] = new int[40];
		while (x > 0) {
			A[b++] = x % 2;
			x = x / 2;
		}
		for (int i = b - 1; i >= 0; i--) {
			System.out.println(A[i]);
		}
	}

}