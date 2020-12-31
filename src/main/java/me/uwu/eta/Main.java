package me.uwu.eta;

import me.uwu.eta.utils.ImgToAscii;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File img = new File("rick.jpg");
        ImgToAscii ascii = new ImgToAscii(img);
        ascii.setDensity(7);
        ascii.setCharById(";", 4);
        ascii.convert();
        ascii.print();
        ascii.exportToTxtFile("result.txt");

        System.out.println("\n\n\n");

        ascii.invert(true);
        ascii.convert();
        ascii.print();

        ascii.exportToTxtFile("result_invert.txt");
    }
}
