/**
* Project Name: SorteiaQuestoes 
* Packge Name: br.edu.models
* Class Name: GerarNumerosAleatorios.java
* Data: 5 de set. de 2023
* Author: dgti dados
* Goals:
* Version: 
* Last Modification: 
*/

package br.edu.models;

import java.util.ArrayList;
import java.util.Random;

public class GerarNumerosAleatorios {
	public static void main(String[] args) {
        int totalNumeros = 5;
        int minimo = 1;
        int maximo = 25;
        int totalRepeticoes = 5;

        Random random = new Random();

        for (int i = 1; i <= totalRepeticoes; i++) {
            ArrayList<Integer> numerosGerados = new ArrayList<>();

            System.out.println("Números aleatórios (Sem repetição) #" + i + ":");

            while (numerosGerados.size() < totalNumeros) {
                int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
                if (!numerosGerados.contains(numeroAleatorio)) {
                    numerosGerados.add(numeroAleatorio);
                }
            }

            for (int numero : numerosGerados) {
                System.out.println(numero);
            }

            System.out.println(); // Adiciona uma linha em branco entre as repetições
        }
    }
}
