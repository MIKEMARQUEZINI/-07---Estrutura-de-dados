package Queue;

import java.util.Scanner;
import java.util.Stack;

public class ExecFila {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<>();
				
		Scanner leia = new Scanner(System.in);
		
		int user;
	
		do {
			System.out.println("\n***********************");
			System.out.println("\n1 - Adicionar um novo Livro na pilha: ");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair ");
			System.out.println("\n***********************");
			
			System.out.println("\nEntre com a opção desejada: ");
			user = leia.nextInt();
			
			
			
				switch (user) {
				case 1: 
					
					//Incluir na lista//
					leia.nextLine();
					System.out.println("\nDigite o nome do Livro: ");
					String name = leia.nextLine();
					pilha.push(name);
					System.out.println(name+" Livro Adicionado!");
					break;
				case 2:
					
					// Imprimindo na tela a fila//
					leia.nextLine();
					System.out.println("\nLista de Livro(s) na pilha: "+pilha);
					break;
				case 3:
					// Removendo item da fila//
					leia.nextLine();
					
					if(pilha.isEmpty()){
						System.out.println("\nA Pilha está vazia!!!!");					
					}else {
						pilha.pop();
						System.out.println("\nLista de Livros na Pilha.."+pilha);
					}
					break;				
				case 0:
					System.out.println("Programa Finalizado !");
					break;
				default:
					System.out.println("\nOpção inválida!!!");
					
				}
				
				
			}while (user!=0);
		
	}

}
