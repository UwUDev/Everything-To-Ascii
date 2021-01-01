package me.uwu.eta.utils;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class GifToAscii {
    private File gif;
    private ArrayList<BufferedImage> frames;
    private ArrayList<String> asciiFrames;
    private int density = 1;
    private String[] chars = new String[]{" ", ".", "*", "+", "^", "&", "8", "#", "@"};
    private boolean invert = false;
    private int playDelay = 100;

    public GifToAscii(File gif) throws IOException {
        this.gif = gif;
        setFrames();
    }

    public void invert(boolean invert){ this.invert = invert; }
    public void setPlayDelay(int delay){ this.playDelay = delay; }
    public void setDensity(int density){ this.density = density; }

    public ArrayList<String> getAsciiFrames(){ return asciiFrames; }


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

    public void exportToFolder(String folderPath, boolean toUTF8) throws IOException {
        int id = 0;
        for (String asciiFrame : asciiFrames) {
            id++;
            String filename = folderPath + "/" + id + ".txt";
            if (!toUTF8) {
                FileWriter writer = new FileWriter(filename);
                writer.write(asciiFrame);
                writer.close();
            } else {
                try (Writer out = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(filename), StandardCharsets.UTF_8))) {
                    out.write(asciiFrame);
                }
            }
        }
    }

    public void setCharById(String character, int id){
        if(id < 0 || id > 8){
            System.out.println("Id need to be between 0 and 8");
            return;
        }
        chars[id] = character;
    }

    public void convert() {
        /*int oof = 0;
        for (BufferedImage frame : frames) {
            oof++;
            Thread.sleep(100);
            ImgToAscii ascii = new ImgToAscii(new File(""));
            ascii.forceBuffered(frame);
            ascii.setDensity(5);
            ascii.convert();
            System.out.println(ascii.getSB().toString());
            ascii.exportToTxtFile("result/" + oof + ".txt", false);
        }*/
        ArrayList<String> txtframes = new ArrayList<>();
        for (BufferedImage frame : frames) {
            ImgToAscii ascii = new ImgToAscii(new File(""));
            ascii.forceBuffered(frame);
            ascii.setDensity(density);
            ascii.invert(invert);
            ascii.setChars(chars[0], chars[1], chars[2], chars[3], chars[4], chars[5], chars[6], chars[7], chars[8]);
            ascii.convert();
            txtframes.add(ascii.getSB().toString());
        }
        asciiFrames = txtframes;
    }

    public void play() throws InterruptedException {
        for (String asciiFrame : asciiFrames){
            Thread.sleep(playDelay);
            System.out.println(asciiFrame);
        }
        /*BufferedImage test = frames.get(1);
        ImgToAscii ita = new ImgToAscii(new File(""));
        ita.forceBuffered(test);
        ita.convert();
        System.out.println(ita.getSB().toString());*/
    }

    private void setFrames() throws IOException {
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
