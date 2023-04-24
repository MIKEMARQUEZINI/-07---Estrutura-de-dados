package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExecQueue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<>();
		int user;
		
		do {
		System.out.println("\n***********************");
		System.out.println("\n1 - Adicionar um novo Cliente na Fila: ");
		System.out.println("2 - Listar todos os Clientes");
		System.out.println("3 - Retirar Cliente da Fila");
		System.out.println("0 - Sair ");
		System.out.println("\n***********************");
		
		System.out.println("\nEntre com a opção desejada: ");
		user = leia.nextInt();
		
		
			
			switch (user) {
			case 1: 
				
				//Incluir na lista//
				leia.nextLine();
				System.out.println("\nDigite o nome: ");
				String name = leia.nextLine();
				fila.add(name);
				
				System.out.println(fila);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				
				// Imprimindo na tela a fila//
				leia.nextLine();
				System.out.println("\nLista de Clientes na Fila: "+fila);
				break;
			case 3:
				// Removendo item da fila//
				leia.nextLine();
				
				if(fila.isEmpty()){
					System.out.println("\nA Fila está vazia!!!!");					
				}else {
					fila.remove();
					System.out.println("\nLista de Clientes na Fila.."+fila);
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
