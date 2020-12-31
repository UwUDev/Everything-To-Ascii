package me.uwu.eta.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgToAscii {
    private BufferedImage img;
    private int density = 1;
    private StringBuilder sb = new StringBuilder();
    private String[] chars = new String[]{" ", ".", "*", "+", "^", "&", "8", "#", "@"};

    public ImgToAscii(File image) {
        try {
            img = ImageIO.read(image);
        } catch (IOException ignored) {
        }
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
        this.sb = new StringBuilder();


        for (int i = 0; i < img.getHeight(); i+=density) {
            for (int j = 0; j < img.getWidth(); j+=density) {
                Color color = new Color(img.getRGB(j, i));
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
        String chara;
        if (g >= 240) {
            chara = chars[0];
        } else if (g >= 210) {
            chara = chars[1];
        } else if (g >= 190) {
            chara = chars[2];
        } else if (g >= 170) {
            chara = chars[3];
        } else if (g >= 120) {
            chara = chars[4];
        } else if (g >= 110) {
            chara = chars[5];
        } else if (g >= 80) {
            chara = chars[6];
        } else if (g >= 60) {
            chara = chars[7];
        } else {
            chara = chars[8];
        }
        return chara;
    }
}
