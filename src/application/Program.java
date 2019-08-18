package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quantos elementos tera a lista:");
		int qtd = scan.nextInt();
		
		PrintService<Integer> ps = new PrintService<>();  //instancia o tipo que quero esse objeto que era generica
		
		for(int i=0; i< qtd;i++) {
			System.out.printf("Digite o valor # %d ", i+1);
			Integer dados = scan.nextInt();
			ps.addvalor(dados);
		}
		
		System.out.println(ps.primeiroelemento());
		ps.mostraLista();

		scan.close();
	}

}
