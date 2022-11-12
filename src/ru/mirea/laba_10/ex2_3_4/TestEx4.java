package ru.mirea.laba_10.ex2_3_4;

import java.io.File;

public class TestEx4 {
    public static void Filelist(String path) {
        File f = new File(path); // создаем объект File для каталога
        String[] fArray = null;
        if (f.exists() || f.isDirectory()) { // если файл существует и если этот файл является каталогом
            fArray = f.list(null); // массив файлов и подкаталогов, которые находятся в этом подкаталоге
        } else System.out.print("Folder not found");

        for (int i = 0; i < fArray.length; i++) {
            if (i < 5) System.out.println(fArray[i]);
        }
    }

    public static void main(String[] arg) {
        Filelist("D:\\Java projects\\Pr_lesson2\\src\\ru\\mirea");
    }
}
