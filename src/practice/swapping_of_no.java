package practice;

import java.util.Scanner;

public class swapping_of_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x");
		int x = sc.nextInt();
		System.out.println("enter y");

		int y = sc.nextInt();
		System.out.println("enter Z");
		int z = sc.nextInt();

		x = x + y + z;
		y = x - (y + z);
		z = x - (y + z);
		x = x - (y + z);
		System.out.println("x =" + x);

		System.out.println("y =" + y);
		System.out.println("z =" + z);

	}
}