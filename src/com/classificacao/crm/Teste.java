package com.classificacao.crm;

public class Teste {

	public static void main(String[] args) {
		Aves a1 = new Aves("Pardal", "Ave", "Piado", "Floresta", "Cinza");
		a1.imprimi();
		
		System.out.println("____________________________________________");
		
		Mamiferos m1 = new Mamiferos("Le�o", "Mamifero", "Rugido", "Savana"
				,"selvagem", "Dourado");
		m1.imprimi();
		
		System.out.println("____________________________________________");
		
		Aquaticos aq1 = new Aquaticos ("Tubar�o", "Aquatico/Peixe", 
				" N�o emite", "Oceanos", "�gua salgada", "�guas profundas");
		aq1.imprimi();

	}

}
