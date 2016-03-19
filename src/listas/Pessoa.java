package listas;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int idade;
	private ArrayList<Pessoa> listaDependentes = new ArrayList<Pessoa>();

	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(ArrayList<Pessoa> dependentes) {
		this.listaDependentes = dependentes;
	}

	public Pessoa(String n, int i, ArrayList<Pessoa> dependentes) {
		this.nome = n;
		this.idade = i;
		this.listaDependentes = dependentes;
	}

	public Pessoa(String n, int i) {
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

	public void mostraDepentendes() {

		if (this.listaDependentes.size() > 0) {
			System.out.println("\nNome do(s) Dependente(s):");
			for (Pessoa dep : this.listaDependentes) {
				System.out.println("\nNome: " + dep.getNome());
				System.out.println("Idade: " + dep.getIdade());
			}
		} else {
			System.out.println("\nNão possuí dependentes!");
		}

	}
	
}