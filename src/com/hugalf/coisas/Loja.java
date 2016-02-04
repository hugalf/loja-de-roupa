package com.hugalf.coisas;

import java.io.IOException;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) throws IOException {

		new Vendedor();

		System.out.println("Obrigado, deseja mais alguma coisa?");
		Scanner sc5 = new Scanner(System.in);
		String simOuNao = sc5.next();

		switch (simOuNao) {
		default:
			System.out.println("Embora então!");

		case "n": {
			System.out.println("Uma boa tarde!");
			break;
		}

		case "s": {
			new Vendedor();
		}
		}
	}
}
