package j4t.Bkit_lesson02_date01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("nhập số phần tử của mảng :");
		Scanner scanners = new Scanner(System.in);
		int a = scanners.nextInt();
		int[] A = new int[a];
		System.out.println("nhập các phần tử trong mảng :");
		for (int i = 0; i <= a - 1; i++) {
			System.out.println("a[" + i + "] =");
			A[i] = scanners.nextInt();
		}
		odd2nd(A, a);

	}

	public static void odd2nd(int[] B, int n) {
		int C[] = new int[n];
		int temp = 0;
		int b = 0;
		for (int i = 0; i <= n - 2; i++) {
			for (int j = 0; j <= n-1 ; j++) {
				if (B[i] > B[j]) {
					temp = B[i];
					B[i] = B[j];
					B[j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (B[i] % 2 != 0) {
				C[b++] = B[i];
			}
		}

		System.out.println(C[1]);
	}
}
