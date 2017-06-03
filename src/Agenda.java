import java.util.Scanner;

public class Agenda {
	private Contato []contatos = new Contato[100];
	Scanner scanner = new Scanner(System.in);
	public Agenda(){
		contatos = new Contato[100];
	}
	
	
	public  void  cadastraContato()throws Exception{
		
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
	
	public void exibirContato()throws Exception{
		System.out.println("Contato> ");
		int opcao = scanner.nextInt();
		if (contatos[opcao] == null){
			throw new Exception("POSIÇÃO INVÁLIDA!");
			
		}else{
			contatos[opcao].toString();
		}
		
	}
	
	

}
