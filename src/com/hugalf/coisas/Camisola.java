package com.hugalf.coisas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Camisola {

	private String tamanho;
	private String cor;

	static ArrayList<String> tamanhos = new ArrayList<>(Arrays.asList("s", "m", "l"));
	static ArrayList<String> cores = new ArrayList<>(Arrays.asList("vermelho", "rosa", "azul"));

	public Camisola(String tamanho, String cor) {

		this.setTamanho(tamanho);
		this.setCor(cor);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
