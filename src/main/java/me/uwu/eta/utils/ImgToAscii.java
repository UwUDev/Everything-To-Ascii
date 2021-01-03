package me.uwu.eta.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ImgToAscii {
    private BufferedImage img;
    private int density = 1;
    private StringBuilder sb = new StringBuilder();
    private String[] chars = new String[]{" ", ".", "*", "+", "^", "&", "8", "#", "@"};
    private boolean invert = false;

    public ImgToAscii(File image) {
        try {
            img = ImageIO.read(image);
        } catch (IOException ignored) {
        }
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

    public void forceBuffered(BufferedImage bufferedImage){
        this.img = bufferedImage;
    }

    public void convert() {
        this.sb = new StringBuilder();


        for (int y = 0; y < img.getHeight(); y=y+(density*2)) {
            for (int x = 0; x < img.getWidth(); x=x+density) {
                Color color = new Color(img.getRGB(x, y));
                double pixelColorValue = (((color.getRed() * 0.30) + (color.getBlue() * 0.59) + (color
                        .getGreen() * 0.11)));
                this.sb.append(toChar(pixelColorValue));
            }
            this.sb.append("\n");
        }
    }

    public StringBuilder getSB(){
        return this.sb;
    }

    public void print(){
        System.out.println(this.sb.toString());
    }

    public String toChar(double g) {
        String character;
        if (invert) {
            if (g >= 240) {
                character = chars[0];
            } else if (g >= 210) {
                character = chars[1];
            } else if (g >= 190) {
                character = chars[2];
            } else if (g >= 170) {
                character = chars[3];
            } else if (g >= 120) {
                character = chars[4];
            } else if (g >= 110) {
                character = chars[5];
            } else if (g >= 80) {
                character = chars[6];
            } else if (g >= 60) {
                character = chars[7];
            } else {
                character = chars[8];
            }
        } else {
            if (g >= 240) {
                character = chars[8];
            } else if (g >= 210) {
                character = chars[7];
            } else if (g >= 190) {
                character = chars[6];
            } else if (g >= 170) {
                character = chars[5];
            } else if (g >= 120) {
                character = chars[4];
            } else if (g >= 110) {
                character = chars[3];
            } else if (g >= 80) {
                character = chars[2];
            } else if (g >= 60) {
                character = chars[1];
            } else {
                character = chars[0];
            }
        }
        return character;
    }

    public void exportToTxtFile(String path, boolean toUTF8) throws IOException {
        if(!toUTF8) {
            FileWriter writer = new FileWriter(path);
            writer.write(sb.toString());
            writer.close();
        } else {
            try (Writer out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(path), StandardCharsets.UTF_8))) {
                out.write(sb.toString());
            }
        }
    }
}
