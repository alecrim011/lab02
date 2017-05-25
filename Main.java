package lab02;

import java.util.Scanner;

public class Main {
	Contato []contatos = new Contato[100];
	Scanner scanner = new Scanner(System.in);
	public static void main (String []args){
		
		
		System.out.println("(C)adastrar Contato" + System.lineSeparator() + "(L)istar Contatos" + System.lineSeparator() + "(E)xibir Contato" + System.lineSeparator() + "(S)air" + System.lineSeparator() + "Opção>");
		Scanner scanner = new Scanner(System.in);
		String opcao = scanner.nextLine();
		String opcaoString;
		switch (opcao) {
		case "C": opcaoString = "C";
		break;
		
		case "L": opcaoString = "L";
		break;
		
		case "E": opcaoString = "E";
		break;
		
		case "S": opcaoString = "S";
		break;
		
		default: opcaoString = "OPCAO INVALIDA";
		     break;
		}
		if (opcaoString.equals("C")){
			cadastra();
			
		}
		
		
		System.out.println(opcaoString);
	}
	
	public void  cadastra()throws Exception{
		System.out.println("posicao: ");
		int posicao = scanner.nextInt();
		if (posicao > 100 || posicao < 0){
			throw new Exception("POSICAO INVALIDA");
		}
		System.out.println("nome: ");
		String nome = scanner.nextLine();
		System.out.println("sobrenome: ");
		String sobrenome = scanner.nextLine();
		System.out.println("telefone: ");
		String telefone = scanner.nextLine();
		Contato c = new Contato(nome, sobrenome, telefone);
		contatos[posicao] = c;
		
		
	}

}
