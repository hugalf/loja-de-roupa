package com.hugalf.coisas;

import com.hugalf.coisas.AnalisarStock;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Vendedor {

	public Vendedor() throws IOException {

		boolean venda;

		venda = false;

		System.out.println("Que deseja?");

		Scanner sc = new Scanner(System.in);
		String peçaDeRoupa = sc.next();

		// analisar stock
		System.out.println(AnalisarStock.analisarStockRoupa(peçaDeRoupa));

		if (venda == false) {

			switch (peçaDeRoupa) {

			default: {
				System.out.println("não temos");
				break;
			}

			case ("camisola"): {
				// tamanho
				System.out.println("De que tamanho?");
				Scanner sc1 = new Scanner(System.in);
				String tamanho = sc1.next();

				if (Camisola.tamanhos.contains(tamanho) == false) {
					while (Camisola.tamanhos.contains(tamanho) == false) {
						System.out.println("Não temos esse tamanho! Diga outro");
						Scanner sc3 = new Scanner(System.in);
						tamanho = sc3.next();
					}
				}

				// cor
				System.out.println("De que cor?");
				Scanner sc2 = new Scanner(System.in);
				String cor = sc2.next();

				if (Camisola.cores.contains(cor) == false) {
					while (Camisola.cores.contains(cor) == false) {
						System.out.println("Não temos essa cor! Diga outra");
						Scanner sc4 = new Scanner(System.in);
						cor = sc4.next();
					}
				}

				Camisola camisola = new Camisola(tamanho, cor);

				System.out
						.println("Aí tem! Uma camisola de tamanho " + camisola.getTamanho() + " " + camisola.getCor());
				venda = true;
			}
			}
		}

	}
}
