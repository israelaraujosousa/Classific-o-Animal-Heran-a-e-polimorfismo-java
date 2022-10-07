package com.classificacao.crm;

public class Mamiferos extends Animal {
	private String tipoDeMamifero;
	private String corDoPelo;
	
	public Mamiferos (String nomeAnimal, String tipo, 
			String somEmitido, String habitat, String tipoDeMamifero, String corDoPelo) {
	
	super (nomeAnimal, tipo, somEmitido, habitat);
	this.tipoDeMamifero =tipoDeMamifero;	
	this.corDoPelo=corDoPelo;
}

	@Override
	public void imprimi() {
		super.imprimi();
		System.out.println("Tipo de Mamifero: "+this.tipoDeMamifero);
		System.out.println("Cor do Pelo: "+ this.corDoPelo);
	
	}
}