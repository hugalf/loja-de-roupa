/**
 * @author hugal
 * @param item the name of the item to check
 * @return what it returns
 * @see
 * @throws IOException
 * 
 */

package com.hugalf.coisas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AnalisarStock {

	public static boolean analisarStockRoupa(String item) throws IOException {

		boolean existeEmStock = false;
		String linha;

		// coloca o ficheiro Stock.txt num buffer
		BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/Stock"));

		// procura linha a linha o item de roupa em Stock.txt e devolve o
		// resultado
		while ((linha = bufferedReader.readLine()) != null) {

			if (linha.contains(item)) {
				existeEmStock = true;
			} else {
				existeEmStock = false;
			}
		}
		bufferedReader.close();

		return existeEmStock;

	}
}