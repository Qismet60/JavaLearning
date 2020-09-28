package com.asoiu;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Created or Read txt file : ");
        String fileName = input.next();
        try {
            File file = new File(fileName.concat(".txt"));
            if (file.createNewFile()) {
                System.out.println("File created:" + file.getName());
                System.out.print("Do you want write in created file? y/n(default \"n\") ");
                char check = input.next().charAt(0);
                if (check == 'y') {
                    Write write = new Write();
                    write.write(file);
                }

            } else {
                System.out.println("File already exist");
                try {
                    Scanner readFile = new Scanner(file);
                    if (readFile.hasNextLine()){
                        while (readFile.hasNextLine()) {
                            String data = readFile.nextLine();
                            System.out.println(data);
                        }
                        readFile.close();
                    }
                    else {
                        System.out.print("File is empty.Do you want write ant text into file?y/n : ");
                        char check = input.next().charAt(0);
                        if (check=='y'){
                            Write write = new Write();
                            write.write(file);
                        }
                    }

                } catch (FileNotFoundException e) {
                    System.out.println("File not found");
                }
            }
        } catch (IOException e) {
            System.out.println("File not created or find");
            e.printStackTrace();
        }
    }


}
