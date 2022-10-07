package com.classificacao.crm;

public class Aves extends Animal {
	private String corDaPena;
		
		public Aves (String nomeAnimal, String tipo, 
				String somEmitido, String habitat, String corDaPena) {
			super (nomeAnimal, tipo, somEmitido, habitat);
			this.corDaPena =corDaPena;		
		
		}
@Override
	public void imprimi() {
		super.imprimi();
		System.out.println("Cor da pena: "+this.corDaPena);
		
		
		
}
}