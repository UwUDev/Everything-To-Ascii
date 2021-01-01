package me.uwu.eta.utils;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class GifToAscii {
    private File gif;
    private ArrayList<BufferedImage> frames;
    private int density = 1;
    private String[] chars = new String[]{" ", ".", "*", "+", "^", "&", "8", "#", "@"};
    private boolean invert = false;

    public GifToAscii(File gif) {
        this.gif = gif;
    }

    public void invert(boolean invert){
        this.invert = invert;
    }

    public void setChars(String character1, String character2, String character3, String character4, String character5, String character6, String character7, String character8, String character9){
        chars[0] = character1;
        chars[1] = character2;
        chars[2] = character3;
        chars[3] = character4;
        chars[4] = character5;
        chars[5] = character6;
        chars[6] = character7;
        chars[7] = character8;
        chars[8] = character9;
    }

    public void setCharById(String character, int id){
        if(id < 0 || id > 8){
            System.out.println("Id need to be between 0 and 8");
            return;
        }
        chars[id] = character;
    }

    public void setDensity(int density){
        this.density = density;
    }

    public void convert() {

    }

    public void play() throws InterruptedException, IOException {
        int oof = 0;
        for (BufferedImage frame : frames) {
            oof++;
            Thread.sleep(100);
            ImgToAscii ascii = new ImgToAscii(new File(""));
            ascii.forceBuffered(frame);
            ascii.setDensity(5);
            ascii.convert();
            System.out.println(ascii.getSB().toString());
            ascii.exportToTxtFile("result/" + oof + ".txt", false);
        }
        /*BufferedImage test = frames.get(1);
        ImgToAscii ita = new ImgToAscii(new File(""));
        ita.forceBuffered(test);
        ita.convert();
        System.out.println(ita.getSB().toString());*/
    }

    public void setFrames() throws IOException {
        ArrayList<BufferedImage> frame = new ArrayList<>();
        ImageReader imageReader = ImageIO.getImageReadersBySuffix("GIF").next();
        ImageInputStream inputStream = ImageIO.createImageInputStream(gif);
        imageReader.setInput(inputStream);
        for (int i = 0, j = imageReader.getNumImages(true); i < j; i++)
        {
            BufferedImage image = imageReader.read(i);
            frame.add(image);
        }
        frames = frame;
    }
}
