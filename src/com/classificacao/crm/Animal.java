package com.classificacao.crm;

public class Animal {
	private String nomeAnimal;
	private String tipo;
	private String somEmitido;
	private String habitat;
	
	public Animal (String nomeAnimal, String tipo, String somEmitido, String habitat) {
		this.nomeAnimal =nomeAnimal;
		this. tipo = tipo;
		this.somEmitido = somEmitido;
		this. habitat = habitat;
		
	}
	
	public void imprimi() {
		System.out.println("Nome: "+nomeAnimal);
		System.out.println("Tipo: "+tipo);
		System.out.println("Som que emite: "+somEmitido);
		System.out.println("Habitat: "+habitat);
	}
	
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSomEmitido() {
		return somEmitido;
	}
	public void setSomEmitido(String somEmitido) {
		this.somEmitido = somEmitido;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	@Override
		public String toString () {
		return "[nome: "+nomeAnimal+", tipo: " + tipo+
				",som que emite: "+somEmitido+", habitat: "+habitat+"]";
	}

}
