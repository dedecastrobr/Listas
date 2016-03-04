package listas;

import java.util.ArrayList;

public class Pessoa {
	
	String nome;
	int idade;
	ArrayList<Pessoa> listaDependentes;

	
	public Pessoa(){}
	
	public Pessoa(String nome){
		this.nome = nome;
	}
	
	public Pessoa(ArrayList<Pessoa> dependentes){
		this.listaDependentes = dependentes;
	}
	
	public Pessoa(String n, int i, ArrayList<Pessoa> dependentes){		
		this.nome = n;
		this.idade = i;
		this.listaDependentes = dependentes;		
	}
	
	public Pessoa(String n, int i){		
		this.nome = n;
		this.idade = i;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Pessoa> getListaDependentes() {
		return listaDependentes;
	}

	public void setListaDependentes(ArrayList<Pessoa> listaDependentes) {
		this.listaDependentes = listaDependentes;
	}
	
	
	

}
