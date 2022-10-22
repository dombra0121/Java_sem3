package ru.mirea.laba_8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToAFile {
    public static void main(String[] args) {
        try(FileWriter writer = new
                FileWriter("D:\\Прочее\\doc1.txt", false))
        {
            Scanner in = new Scanner(System.in);
            String text = in.nextLine();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
