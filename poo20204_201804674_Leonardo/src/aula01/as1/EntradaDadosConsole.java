package aula01.as1;
import java.util.Scanner;

public class EntradaDadosConsole {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String nome;
			int matricula;
			
			System.out.println("Entre com o nome do aluno:");
			nome = sc.nextLine();
			
			System.out.println("Entre com a matricula do aluno:");
			matricula = sc.nextInt();
			
			System.out.println("Aluno: " + nome + " matricula: " + matricula);
		}
}