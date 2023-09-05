/**
* Project Name: SorteiaQuestoes 
* Packge Name: br.edu.principal
* Class Name: NumerosAleatoriosSemRepeticao.java
* Data: 5 de set. de 2023
* Author: dgti dados
* Goals: Generate and return 5 random numbers between 1 and 25 without repetition.
* Version: 1.0
* Last Modification: ~
*/

package br.edu.principal;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumerosAleatoriosSemRepeticao {
	public static void main(String[] args) {
		int quantidadeNumeros = 5;
        int minimo = 1;
        int maximo = 25;
        
        if (quantidadeNumeros > (maximo - minimo + 1)) {
            System.out.println("Não é possível gerar " + quantidadeNumeros + " números diferentes entre " + minimo + " e " + maximo);
            return;
        }
        
        Random random = new Random();
        System.out.println("Números aleatórios sem repetição entre " + minimo + " e " + maximo + ":");

        for (int i = 0; i < 8; i++) {
        	Set<Integer> numerosGerados = new HashSet<>();
	        
        	
	        while (numerosGerados.size() < quantidadeNumeros) {
	            int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
	            numerosGerados.add(numeroAleatorio);
	        }
	
		    System.out.println("Equipe " + i + ": ");
	    	for (int numero : numerosGerados) {
	            System.out.print(numero + " ");
	        }
	    	System.out.println("\n");
		}
	}
}
