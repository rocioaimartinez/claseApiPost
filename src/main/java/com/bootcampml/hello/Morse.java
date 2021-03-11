package com.bootcampml.hello;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Morse {
    char english []= { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?' };

    String morse []= { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.." };

    public String morseToEnglish(String morseCode)
    {
        StringBuilder individual;
        StringBuilder frase= new StringBuilder();

        String palabra[];
        String phrase[]= morseCode.split("   ");

        for (int i =0; i<phrase.length;i++){

            palabra= phrase[i].split(" ");
            individual= new StringBuilder();

            for (int j =0; j< palabra.length;j++){

                for (int k=0; k<morse.length; k++){

                    if(morse[k].equals(palabra[j])){

                        individual.append(String.valueOf(english[k]));
                    }
                }
            }
            frase.append(individual.toString());
            frase.append(" ");

        }
        return frase.toString();
    }
}
