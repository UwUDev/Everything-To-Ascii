package me.uwu.eta;

import me.uwu.eta.utils.ConsoleUtils;
import me.uwu.eta.utils.ImgToAscii;

import java.io.File;
import java.io.IOException;

public class IMGTest {
    public static void main(String[] args) throws IOException {
        ConsoleUtils.autoColorSetup();
        ConsoleUtils.clearScreen();

        File img = new File("salut.jpg");
        ImgToAscii ascii = new ImgToAscii(img);
        ascii.setDensity(13);
        /*ascii.setCharById(";", 4);
        ascii.convert();
        ascii.print();
        ascii.exportToTxtFile("result.txt", true);

        System.out.println("\n\n\n");

        ascii.invert(true);
        ascii.convert();
        ascii.print();

        ascii.exportToTxtFile("result_invert.txt", true);*/
        ascii.setChars(" ", " ", "░", "░", "▒", "▒", "▓", "▓", "█");
        ascii.convert();
        ascii.exportToTxtFile("result.txt", true);
        ascii.print();
    }
}
