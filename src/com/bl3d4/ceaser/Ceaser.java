package com.bl3d4.ceaser;


public class Ceaser {
    public String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encrypt(String input, int key) {

        StringBuilder encrypted = new StringBuilder(input.toUpperCase());
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);

        for (int i = 0; i < encrypted.length(); i++) {
            char curChar = encrypted.charAt(i);
            int indexOf = alphabet.indexOf(curChar);
            if (indexOf != -1) {
                char newChar = shiftedAlphabet.charAt(indexOf);
                encrypted.setCharAt(i, newChar);
            }
        }
        return encrypted.toString().toLowerCase();
    }

    String encryptTwoKeys(String input, int key1, int key2) {
        String encryptedKey1 = encrypt(input, key1);
        String encryptedKey2 = encrypt(input, key2);
        StringBuilder finalEncrypted = new StringBuilder(input);


        for (int i = 0; i < encryptedKey1.length(); i += 2) {
            char currentChar = encryptedKey1.charAt(i);
            finalEncrypted.replace(i, i + 1, String.valueOf(currentChar));


        }
        for (int i = 1; i < encryptedKey2.length(); i += 2) {
            char currentChar = encryptedKey2.charAt(i);
            finalEncrypted.replace(i, i + 1, String.valueOf(currentChar));


        }

        return finalEncrypted.toString();
    }

    String decrypted(String encrypted)
    {
        Ceaser ceaser = new Ceaser();
        for (int i=1;i<+alphabet.length();i++)
        {
            String s = ceaser.encrypt(encrypted,alphabet.length()-i);
            System.out.println(i+"\t"+s);
        }
        return "success";
    }
    String decryptedWithTwoKeys(String encrypted,int key1,int key2)
    {
        Ceaser ceaser = new Ceaser();
        return ceaser.encryptTwoKeys(encrypted,26-key1,26-key1);
    }
}
