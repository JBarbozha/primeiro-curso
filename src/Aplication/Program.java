package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entity.Cliente;

public class Program {
	public static void main(String[] args) {
		// Criação de um Menu
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cliente = new Cliente();
		int opc = 1;
		while(opc != 3) {
			opc = criarMenu(sc);
			if(opc == 1) {
				cadastroCliente(sc,cliente);
			}else if(opc == 2){
				listaCadastro(sc);
			}else if(opc == 3){
				System.out.println("Você saiu do Sistema!");
				System.exit(0);
			}
		}
		
		
		sc.close();

	}
	public static int criarMenu(Scanner sc) {
		int opcao = 3;
		boolean valida = false;
		while(!valida) {			
			System.out.println("*--------------------*");
			System.out.println("|   Menu de Opções   |");
			System.out.println("|---------------------");
			System.out.println("| 1 - Incluir        |");
			System.out.println("| 2 - Consultar      |");
			System.out.println("| 3 - Sair           |");
			System.out.println("*--------------------*");
			System.out.print("Escolha opção: ");
			try {
				//String entrada = sc.nextLine();
				opcao = sc.nextInt();
				if(opcao == 1 || opcao == 2 || opcao == 3) {
					valida = true;
				}else {
					throw new Exception("Entrada Inválida.");
				}
			}
			catch(Exception e) {
				System.out.println("Entrada Inválida, digite novamente.\n");
			}	
		}
		return opcao;
		
	}
	
	public static void cadastroCliente(Scanner sc, Cliente cliente) {
		System.out.println("Cadastro de Clientes");
		System.out.print("Quantos clientes a cadastrar? ");
		int id;
		String nome;
		String email;
		String telefone;
		int num = sc.nextInt();
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		for(int i = 1; i <= num; i++) {
			System.out.println(i+"o Cliente");
			System.out.print("Informe o Id: ");
			id = sc.nextInt();
			System.out.print("Informe o nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Informe o e-mail: ");
			email = sc.nextLine();
			System.out.print("Informe o telefone: ");
			telefone = sc.next();
			lista.add(new Cliente(id,nome,email,telefone));
		}
	}
	
	public static void listaCadastro(Scanner sc) {
		System.out.println("--- Listagem de Clientes ---");
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		ArrayList< Cliente > a1 = new ArrayList< Cliente >();
		a1.addAll(lista);
		System.out.println(a1);
			//return "Id: "+lista.getId(0)+", Nome: "+c.getNome()+", E-mail: "+c.getEmail()+", Telefone: "+c.getTelefone();
		
	}
}
