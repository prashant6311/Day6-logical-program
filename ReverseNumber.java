package logicalProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int ch = num;
		int rem;
		int reverse = 0;
		while (num > 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		System.out.println("number " + ch + " is reversed to " + reverse);
	}

}
