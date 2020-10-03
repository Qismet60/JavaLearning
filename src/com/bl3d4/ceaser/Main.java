package com.bl3d4.ceaser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------------------------------WELCOME CEASER ALGORITHM PROGRAM----------" +
                "--------------------------------------------------------------");
        Ceaser ceaseAlgo = new Ceaser();
        String message ="SALAM";
        String message1 = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
        System.out.println("[x]Your sentences : " + message);
        message = message.toUpperCase();
        int key1 = 8;
        int key2 = 21;
        String encrypted = ceaseAlgo.encrypt(message, key1);
        System.out.println("[x]Encrypted : " + encrypted);
        String decrypted = ceaseAlgo.encrypt(encrypted, 26 - key1);
        System.out.println("[x]Decrypted : " + decrypted);
        System.out.println();
        System.out.println("-------------------------------------------------CEASER ALGORITHM PROGRAM WITH 2 KEY----------" +
                "-----------------------------------------------------------");
        encrypted = ceaseAlgo.encryptTwoKeys(message,key1,key2);
        System.out.println("[x]Encrypted : " + encrypted);
        decrypted = ceaseAlgo.encryptTwoKeys(encrypted, 26 - key1,26-key2);
        System.out.println("[x]Decrypted : " + decrypted);
    }
}
