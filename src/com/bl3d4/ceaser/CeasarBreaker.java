package com.bl3d4.ceaser;

//import org.jetbrains.annotations.NotNull;

public class CeasarBreaker {
    public static void main(String[] args) {

    }

    public int[] CountLetters(String message) {
        String alph = "abcdefghijklmnopqrstuvwxyz";

        int[] count = new int[26];
        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));
            int indexOf = alph.indexOf(ch);
            if (indexOf != -1) {
                count[indexOf]++;
            }
        }
        return count;
    }

    public int MaxIndex(int[] values) {
        int indexOfMax = 0;
        int max = 0;
        for (int k = 0; k < values.length; k++) {
            if (values[k] > max) {
                max = values[k];
                indexOfMax = k;
            }
        }
        return indexOfMax;
    }

    public String halfOfString(String message, int start) {
        String result = "";
        for (int i = start; i < message.length(); i += 2) {
            result = result + message.charAt(i);
        }
        return result;
    }



    public int getKey(String s) {
        int[] freqs = CountLetters(s);
        int maxIndex = MaxIndex(freqs);
        int decryptKey = maxIndex - 4;
        if (maxIndex < 4) {
            decryptKey = 26 - (4 - maxIndex);
        }
        return decryptKey;
    }
    //decrypted

    public String decryptedWithKey(String encrypted, int key) {
        Ceaser ceaser = new Ceaser();
        return ceaser.encrypt(encrypted, 26 - key);
    }

    public String decryptedTwoKeys(String encrypted) {
        Ceaser ceaser = new Ceaser();
        StringBuilder decryptMessage = new StringBuilder(encrypted);
        String message1 = halfOfString(encrypted, 0);
        String message2 = halfOfString(encrypted, 1);
        int key1 = getKey(message1);
        int key2 = getKey(message2);

        String dMessage1 = ceaser.encrypt(message1, 26 - key1);
        String dMessage2 = ceaser.encrypt(message2, 26 - key2);

        for (int i = 0; i < message1.length(); i++) {
            decryptMessage.setCharAt(2 * i, dMessage1.charAt(i));
        }
        for (int i = 0; i < message2.length(); i++) {
            decryptMessage.setCharAt(2 * i + 1, dMessage2.charAt(i));
        }

        System.out.println("first key : " + key1 + "\nsecond key : " + key2);
        System.out.println("The message decrypted with two keys : " + decryptMessage.toString());
        return decryptMessage.toString();
    }


}
