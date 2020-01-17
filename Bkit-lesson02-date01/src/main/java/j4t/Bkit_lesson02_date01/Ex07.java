package j4t.Bkit_lesson02_date01;

import java.util.Random;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		Vector v = new Vector();
		Random rd = new Random();
		int number = 0;
		for (int i = 0; i < 5;) {
			number = 20 + rd.nextInt(30 - 20 + 1);
			if (!v.contains(number)) {

				i++;
				v.add(number);
				System.out.println(number);
			}
		}
	}

}