package com.asoiu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {

    public Scanner scanner = new Scanner(System.in);

    public void write(File file) {
        try {
            FileWriter fileWriter = new FileWriter(file.getName());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int len;
            System.out.print("How many Sentence/Line you Want to Enter ? ");
            len = scanner.nextInt();
            String sentence;
            System.out.println("Enter " + len + " Lines of Sentences followed by Enter : ");
            for (int i = 0; i < len; i++) {
                sentence = scanner.next();
                bufferedWriter.write(sentence + " ");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file named" + file.getName() + "....");
        }
    }
}
