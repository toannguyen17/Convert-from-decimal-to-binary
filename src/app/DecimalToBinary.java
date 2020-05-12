package app;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number you want to convert to binary: ");
		int numeric = scanner.nextInt();
		int num     = numeric;

		String baseBinary = "";
		String binary     = "";

		while (numeric > 0){
			baseBinary += numeric%2;
			numeric     = numeric/2;
		}

		for (int i = baseBinary.length()-1; i >= 0; i--){
			char item = baseBinary.charAt(i);
			binary += item;
		}
		System.out.println(num + " Decimal = " + binary + " Binary");




		MyStack arrBin = new MyStack(baseBinary.length());
		for (int i = 0; i < baseBinary.length(); i++){
			char item = baseBinary.charAt(i);
			arrBin.push(item);
		}

		System.out.print(num + " Decimal = ");
		for (int i = 0; i < baseBinary.length(); i++){
			System.out.print(arrBin.pop());
		}
		System.out.print(" Binary");
	}
}
