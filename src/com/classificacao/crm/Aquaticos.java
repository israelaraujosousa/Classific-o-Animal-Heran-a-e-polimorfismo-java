package com.classificacao.crm;

public class Aquaticos extends Animal{
	private String tipoDeAgua;
	private String profundidade;
	
	public Aquaticos (String nomeAnimal, String tipo, 
			String somEmitido, String habitat, String tipoDeAgua, String profundidade) {
		
		super (nomeAnimal, tipo, somEmitido, habitat);
		
		this.tipoDeAgua =tipoDeAgua;	
		this.profundidade=profundidade;
	}
	@Override
	public void imprimi() {
		super.imprimi();
		System.out.println("Tipo de água: "+this.tipoDeAgua);
		System.out.println("profundidade: "+ this.profundidade);

}
}
