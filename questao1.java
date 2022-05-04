package Questao1;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);
		
		float notas[] = new float[10];
		
		float soma=0;
		for(int i=0; i<10; i++) {
		System.out.println("Entre com a nota: "+(i+1));
		notas[i]=ler.nextFloat();
		soma+=notas[i];
		}
		float media=soma/10;
		System.out.printf("A média das notas é: %.2f ",media);
	}
}
