package InterviewCodes;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();

		for (int i = 2; i <= (num - 1); i++) {
			if ((num % i) == 0) {
				System.out.println("Not Prime");
				break;
			} else {
				System.out.println("Prime");
				break;
			}
		}
	}

}
