package com.bl3d4.ceaser;

public class Ceaser {
    public String encrypt(String input, int key) {
        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        for (int i = 0; i < encrypted.length(); i++) {
            char curChar = encrypted.charAt(i);
            int indexOf = alphabet.indexOf(curChar);
            if (indexOf != -1) {
                char newChar = shiftedAlphabet.charAt(indexOf);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString();
    }
}
