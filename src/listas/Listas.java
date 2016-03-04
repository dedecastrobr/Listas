package listas;

import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
	
	public static ArrayList<String> listaPaises = new ArrayList<String>();
	public static ArrayList<Integer> listaInteiros = new ArrayList<Integer>();
	public static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

	
	public static void main(String[] args) {
		
		// Scanner para leitura do teclado
		Scanner sc = new Scanner(System.in);
		
		// Ciração da lista de países
		for(int i=0; i < 5;i++){
			System.out.println("Informe o nome de um país");
			listaPaises.add(sc.next());			
		}
		
		// Lista de 50 valores inteiros
		for(int i=0; i < 50;i++){
			listaInteiros.add(i + 10);			
		}
		
		String op = "";
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome da pessoa: " + i);
			listaPessoas.add(new Pessoa(sc.next()));
			System.out.println("Informe a idade: ");
			listaPessoas.get(i).setIdade(sc.nextInt());
			System.out.println("Possui dependentes? (S/N)");
			op = sc.next();
				if(op.equalsIgnoreCase("S")){
					ArrayList<Pessoa> dependentes = new ArrayList<Pessoa>();
					String nome = "";
					int idade = 0;
					do{
						System.out.println("Informe o nome ou FIM para sair:");
						op = sc.next();
						if(!op.equalsIgnoreCase("fim")){
							nome = op;
							System.out.println("Informe a idade do dependente:");
							idade = sc.nextInt();
							dependentes.add(new Pessoa(nome, idade));
						}
					}while (!op.equalsIgnoreCase("fim"));
				}
			
			
		}


	}

}
