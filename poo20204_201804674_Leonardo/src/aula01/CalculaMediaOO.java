package aula01;

import java.text.DecimalFormat;

public class CalculaMediaOO {

	public static void main(String[] args) {
		
		Aluno a1= new Aluno("Paulo", 8.0, 6.0, 5.0);
		double mediaCalculada[] = new double [4];
		mediaCalculada[0] = a1.calculaMedia();
		
		DecimalFormat df = new DecimalFormat ("#,###.00");
		System.out.println("Média de Paulo = " + df.format(mediaCalculada[0]));
		
		Aluno a2= new Aluno("Maria", 4.0, 6.0, 3.0);
		mediaCalculada[1] = a2.calculaMedia();
		
		System.out.println("Média de Maria = " + df.format(mediaCalculada[1]));
		
		Aluno a3= new Aluno("José", 6.0, 4.0, 9.0);
		mediaCalculada[2] = a3.calculaMedia();
		
		System.out.println("Média de José = " + df.format(mediaCalculada[2]));
		
		Aluno a4= new Aluno("Patrícia", 7.0, 8.0, 9.0);
		mediaCalculada[3] = a4.calculaMedia();
		
		System.out.println("Média de Patrícia = " + df.format(mediaCalculada[3]));
		
		//Media Geral
		System.out.println("Média Geral= " + (mediaCalculada[0]+mediaCalculada[1]+mediaCalculada[2]+mediaCalculada[3])/4);
	}
	
}
		
