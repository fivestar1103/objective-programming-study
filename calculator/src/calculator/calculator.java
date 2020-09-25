package calculator;

import java.util.Scanner;
import calculator.number;

public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String power;
		int num = 0, digit = 10;
		char tmp;
		number number1 = new number();
		
		while (true) {
			System.out.println("enter \"ON\" to turn on calculator");
			power = scanner.nextLine();
			while (power.equals("ON")) {
				System.out.println("enter \"OFF\" to turn off calculator");
				tmp = scanner.next().charAt(0);
				if (47 < tmp && tmp < 58) {
					number1.setNumber(tmp-48);
				}
			}
		}
	}
}
