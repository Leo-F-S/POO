package aula01;

import java.util.Scanner;

public class DoisNumerosPE {

	public static void main(String[] args) {
		//O resultado da diferença dos 2 valores informados é acrescentado em 1, pois o programa se refere a um intervalo fechado,
		//onde são considerados os 2 números das pontas. Exemplo: x=5 e y=10 : 5, 6, 7, 8, 9, 10. 10-5= 5, mas no intervalo existe
		//um total de 6 dígitos.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		int x = sc.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int y = sc.nextInt();
		
		int NInter;
		int maior;
		int menor;
		if(x>y) {
			maior= x;
			menor= y;
			NInter= x-y;
			System.out.println("Quantidade de números no intervalo entre X e Y é: " + NInter);
			}
		else {
			maior= y;
			menor= x;
			NInter= y-x;
			System.out.println("Quantidade de números no intervalo entre X e Y é: " + NInter);
		}
		NInter=NInter+1;
		int intervalo[]= new int [NInter];
		for(int i=0; i<NInter; i++){
			intervalo[i]= menor+i;
		}
		
		int soma= 0;
		for(int i=menor; i<=maior; i++) {
			soma= soma+i;
			
		}
		System.out.println("A soma dos números do intervalo é: " + soma);
		double media=0;
		for(int i= 0; i<NInter; i++) {
			media=media+intervalo[i];
		}
		
		System.out.println("A media dos números do intervalo é: " + media/NInter);
		int contpar=0;
		int contimpar=0;
		for(int i=0; i<NInter; i++) {
			if(intervalo[i]%2==0) {
				contpar=contpar+1;
			}
			else {
				contimpar=contimpar+1;
			}
		}
		
		System.out.println("Quantidade de números pares no intervalo: " + contpar);
		System.out.println("Quantidade de números ímpares no intervalo: " + contimpar);
	}
}
