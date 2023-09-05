/**
* Project Name: SorteiaQuestoes 
* Packge Name: br.edu.models
* Class Name: CincoListasDeCincoNumerosAleatorios.java
* Data: 5 de set. de 2023
* Author: dgti dados
* Goals:
* Version: 
* Last Modification: 
*/

package br.edu.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CincoListasDeCincoNumerosAleatorios {
	public static void main(String[] args) {
        int quantidadeListas = 5;
        int numerosPorLista = 5;
        int minimo = 1;
        int maximo = 25;

        if (numerosPorLista > (maximo - minimo + 1)) {
            System.out.println("Não é possível gerar " + numerosPorLista + " números diferentes entre " + minimo + " e " + maximo);
            return;
        }

        Random random = new Random();

        for (int i = 1; i <= quantidadeListas; i++) {
            List<Integer> numerosGerados = new ArrayList<>();
            Set<Integer> numerosUsados = new HashSet<>();

            System.out.println("Lista " + i + " de números aleatórios sem repetição entre " + minimo + " e " + maximo + ":");

            while (numerosGerados.size() < numerosPorLista) {
                int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
                if (!numerosUsados.contains(numeroAleatorio)) {
                    numerosGerados.add(numeroAleatorio);
                    numerosUsados.add(numeroAleatorio);
                }
            }

            for (int numero : numerosGerados) {
                System.out.println(numero);
            }

            System.out.println(); // Adiciona uma linha em branco entre as listas
        }
    }
}
