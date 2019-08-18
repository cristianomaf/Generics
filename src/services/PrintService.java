package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>{ // tipo T ou qualquer nome  Generics    
	
	private List<T> lista = new ArrayList<>();  
	
	public void addvalor(T valor) {    // recebe um valor adiciona na lista
		lista.add(valor);
	}
	
	//primeiro elemento da lista
	public T primeiroelemento() {
		if(lista.isEmpty()) {         //verifica se esta vazia
			throw new IllegalStateException("Lista esta vazia");
		}
		return (lista.get(0));     //caso contrario retorna o primeiro elemento da lista
	}
	
	//exibe os valores da lista
	
	public void mostraLista() {
		System.out.print("[");
		if(!lista.isEmpty()) { // se lista nao for vazia
			System.out.print(lista.get(0)); //exibe o primeiro elemento
		}
		for(int i=1; i<lista.size();i++) { //percorre o restante da lista
			System.out.print(", "+lista.get(i));			
		}
		System.out.println("]");
		
	}
	
	
	
}
