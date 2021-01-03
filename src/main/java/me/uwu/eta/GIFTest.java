package me.uwu.eta;

import me.uwu.eta.utils.ConsoleUtils;
import me.uwu.eta.utils.GifToAscii;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GIFTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("Enter density:");
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        System.out.print("\nEnter delay:");
        int dl = in.nextInt();
        ConsoleUtils.autoColorSetup();
        ConsoleUtils.clearScreen();

        File gif = new File("tenor3.gif");
        GifToAscii ascii = new GifToAscii(gif);
        //ascii.setChars(" ", " ", "░", "░", "▒", "▒", "▓", "▓", "█");
        ascii.setDensity(d);
        ascii.setPlayDelay(dl);
        ascii.convert();
        ascii.setPlayLoops(50);

        ascii.play();
        ascii.exportToFolder("result", true);
    }
}
