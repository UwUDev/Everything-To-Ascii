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
        ascii.setCharById(";", 4);
        ascii.invert(true);
        ascii.convert();
        //System.out.println(ascii.getSB().toString());
        ascii.print();

        System.out.println("\n\n\n");

        ascii.invert(false);
        ascii.convert();
        ascii.print();

        saveToFile(ascii.getSB());
    }

    public static void saveToFile(StringBuilder sb) throws IOException {
        FileWriter writer = new FileWriter("result.txt");
        writer.write(sb.toString());
        writer.close();
    }
}
