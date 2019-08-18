package application;

import java.util.Scanner;

import services.PrintService2;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quantos nomes tera a lista:");
		int qtdNomes = scan.nextInt();
		
		PrintService2 ps = new PrintService2();
		
		for(int i=0; i< qtdNomes;i++) {
			System.out.printf("Digite o valor # %d ", i+1);
			String nomes = scan.next();
			ps.addvalor(nomes);
		}
		
		System.out.println(ps.primeiroelemento());
		ps.mostraLista();

		scan.close();
	}

}
