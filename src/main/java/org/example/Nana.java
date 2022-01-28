package org.example;

import java.util.Arrays;
import java.util.List;

public class Nana extends Grandma {

    public Nana() {
        super("Nana");
    }

    @Override
    public boolean likesWord(String str) {
        return startsWithVowel(str);
    }

    public static boolean startsWithVowel(String str) {
        char[] vowels = {'a','e','i','o','u','y'};
        for (char c : vowels) {
            if (str.charAt(0) == c) {
                return true;
            }
        }
        return false;
    }

}