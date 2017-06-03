import java.util.Scanner;

public class Main {
	Contato []contatos = new Contato[100];
	Scanner scanner = new Scanner(System.in);
	public static void main (String []args) throws Exception{
		
		
		System.out.println("(C)adastrar Contato" + System.lineSeparator() + "(L)istar Contatos" + System.lineSeparator() + "(E)xibir Contato" + System.lineSeparator() + "(S)air" + System.lineSeparator() + "Opção>");
		Scanner scanner = new Scanner(System.in);
		String opcao = scanner.nextLine();
		String opcaoString;
		Agenda a = new Agenda();
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
			a.cadastraContato();
			
		}else if(opcaoString.equals("E")){
			a.exibirContato();
		}
		
		
		System.out.println(opcaoString);
	}
	
	

}
