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

		/*// Criação da lista de paises
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome de um pais");
			listaPaises.add(sc.nextLine());
		}

		// Lista de 50 valores inteiros
		for (int i = 0; i < 50; i++) {
			listaInteiros.add(i + 10);
		}*/

		String op = "";
		String nome = "";
		int idade = 0;
		ArrayList<Pessoa> dependentes = null;

		boolean sair = false;
		while(!sair){ 
			switch (mostraMenu()) {
			case 1:
				for (int i = 0; i < 5; i++) {
					dependentes = new ArrayList<Pessoa>();
					System.out.println("Informe o nome da pessoa: " + (i + 1));
					nome = sc.nextLine();
					System.out.println("Informe a idade: ");
					idade = sc.nextInt();
					sc.nextLine(); // CONSOME QUEBRA DE LINHA
					System.out.println("Possui dependentes? (S/N)");
					op = sc.nextLine();
					if (op.equalsIgnoreCase("S")) {
						do { 
							System.out.println("Informe o nome ou FIM para sair:");
							op = sc.nextLine();
							if (!op.equalsIgnoreCase("fim") && dependentes.size() < 2) {
								String nomeDep = op;
								System.out.println("Informe a idade do dependente:");
								int idadeDep = sc.nextInt();
								sc.nextLine(); // CONSOME QUEBRA DE LINHA
								dependentes.add(new Pessoa(nomeDep, idadeDep));
							}
						} while (!op.equalsIgnoreCase("fim") &&  dependentes.size() < 2);
					}
					listaPessoas.add(new Pessoa(nome, idade, dependentes));
				}
				break;
			case 2:
				listarPessoas();
				break;
			case 3:
				buscarPessoa();
				break;
			case 4:
				listarPaises();
				break;
			case 5:
				listarInteiros();
				break;
			case 99:
				sair = true;
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}			
		}			
		
	}

	private static String[] menuOpcoes = { "1 - Cadastro \n",
										   "2 - Listar Pessoas \n",	
										   "3 - Buscar Pessoas c/ mais de 2 Dep. \n",
										   "4 - Listar Paises \n",	
										   "5 - Listar Inteiros \n", 
										   "99 - Sair \n" };

	public static int mostraMenu() {

		Scanner sc = new Scanner(System.in);

		System.out.println(" ");
		System.out.println("####### MENU INICIAL #######: ");
		System.out.println("############################");
		for (String op : menuOpcoes) {
			System.out.print(op);
		}
		System.out.println("############################");
		System.out.println("############################");
		System.out.println(" ");

		int opcaoSelecionada = sc.nextInt();

		return opcaoSelecionada;
	}

	public static void listarPaises() {
		System.out.println("Nomes dos paises:");
		for (String pais : listaPaises) {
			System.out.println(pais);
		}

	}

	public static void listarInteiros() {
		System.out.println("Valores inteiros:");
		for (Integer p : listaInteiros) {
			System.out.println(p);

		}
	}

	public static void listarPessoas() {

		for (Pessoa p : listaPessoas) {
			System.out.println("\nNome da pessoa:");
			System.out.println("\nNome: " + p.getNome());
			System.out.println("Idade: " + p.getIdade());
			p.mostraDepentendes();

		}
	}
	
	public static ArrayList<Pessoa> buscarPessoa(){
		ArrayList<Pessoa> resultBusca = new ArrayList<Pessoa>();
		for(Pessoa pes: listaPessoas){
			if(pes.getListaDependentes().size() >= 2){
				System.out.println("O " + pes.getNome() + " Tem dois ou mais Dependentes!");
				resultBusca.add(pes);
			}
			
		}
		return resultBusca;	
	}

}
