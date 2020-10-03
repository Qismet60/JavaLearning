package com.bl3d4.ceaser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------------------------------WELCOME CEASER ALGORITHM PROGRAM----------" +
                "--------------------------------------------------------------");
        Ceaser ceaseAlgo = new Ceaser();
        String message = "Caesar Algorithm decode and encode :)";
        System.out.println("[x]Your sentences : " + message);
        message = message.toUpperCase();
        int key = 17;
        String encrypted = ceaseAlgo.encrypt(message, key);
        System.out.println("[x]encrypted : " + encrypted);
        String decrypted = ceaseAlgo.encrypt(encrypted, 26 - key);
        System.out.println("[x]decrypted : " + decrypted);
    }
}
