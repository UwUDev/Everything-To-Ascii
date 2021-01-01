package me.uwu.eta;

import me.uwu.eta.utils.GifToAscii;

import java.io.File;
import java.io.IOException;

public class GIFTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        File gif = new File("tenor3.gif");
        GifToAscii ascii = new GifToAscii(gif);
        ascii.setChars(" ", " ", "░", "░", "▒", "▒", "▓", "▓", "█");
        ascii.setDensity(7);
        ascii.setPlayDelay(1);
        ascii.convert();

        ascii.play();
        ascii.exportToFolder("result", true);
    }
}
