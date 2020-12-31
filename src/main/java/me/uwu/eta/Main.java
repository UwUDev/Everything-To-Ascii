package me.uwu.eta;

import me.uwu.eta.utils.ImgToAscii;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File img = new File("rick.jpg");
        ImgToAscii ascii = new ImgToAscii(img);
        ascii.setDensity(7);
        ascii.convert();
        //System.out.println(ascii.getSB().toString());
        ascii.print();

        saveToFile(ascii.getSB());
    }

    public static void saveToFile(StringBuilder sb) throws IOException {
        File save = new File("result.txt");
        save.createNewFile();

        FileWriter myWriter = new FileWriter("result.txt");
        myWriter.write(sb.toString());
        myWriter.close();
    }
}
