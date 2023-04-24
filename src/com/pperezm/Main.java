package com.pperezm;

import java.util.Random;

/*
@author Pablo Arturo Pérez Mata
@email pablo.arturo.perez@gmail.com
@description Practica alternativa para realizar Token
*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        String token =
        Token.CreacionToken();
        System.out.println("Tu token es: " + token);

        Random random = new Random();

        char randomCaracterUno = (char) (random.nextInt(26) + 'A');
        char randomCaracterDos = (char) (random.nextInt(26) + 'A');
        char randomCaracterTres = (char) (random.nextInt(26) + 'A');
        char randomCaracterCuatro = (char) (random.nextInt(26) + 'A');

        System.out.println(""+randomCaracterUno + randomCaracterDos + randomCaracterTres + randomCaracterCuatro);
        Random random1 = new Random();

        char randomizedCharacter = (char) (random1.nextInt(26) + 'A');
        System.out.println("Generated Random Character: " + randomizedCharacter);

    }
}
