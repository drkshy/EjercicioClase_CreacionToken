package com.pperezm;

import java.util.Random;

public class Token {
    public static String CreacionToken() {

        Random random = new Random();

        char randomCaracterUno = (char) (random.nextInt(90) + 'A');
        char randomCaracterDos = (char) (random.nextInt(90) + 'A');
        char randomCaracterTres = (char) (random.nextInt(90) + 'A');
        char randomCaracterCuatro = (char) (random.nextInt(90) + 'A');

        return new String("" + randomCaracterUno + randomCaracterDos + randomCaracterTres + randomCaracterCuatro);
    }
}
