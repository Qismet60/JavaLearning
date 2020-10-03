package com.bl3d4.ceaser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String message = "At noon be in the conference room with your hat on for a surprise party. YELL LOUD!";
        System.out.println("[x]Your sentences : " + message);
        int key = 15;
        int key1 = 8;
        int key2 = 21;
        System.out.println("----------------------------------------------------WELCOME CEASER ALGORITHM PROGRAM----------" +
                "--------------------------------------------------------------");
        Ceaser ceaseAlgo = new Ceaser();

        String encrypted = ceaseAlgo.encrypt(message, key);
        System.out.println("[x]Encrypted : " + encrypted);
        System.out.println();
        
        System.out.println("-------------------------------------------------CEASER ALGORITHM PROGRAM WITH 2 KEY----------" +
                "-----------------------------------------------------------");
        encrypted = ceaseAlgo.encryptTwoKeys(message,key1,key2);
        System.out.println("[x]Encrypted : " + encrypted);
        System.out.println();

        System.out.println("----------------------------------------------------WELCOME CEASER ALGORITHM PROGRAM DECRYPTED----------" +
                "--------------------------------------------------------------");
        String dmessage = "pi cddc qt xc iwt rdcutgtcrt gddb lxiw ndjg wpi dc udg p hjgegxht epgin. ntaa adjs!";
        ceaseAlgo.decrypted(dmessage);
    }
}
