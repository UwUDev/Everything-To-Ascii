package me.uwu.eta;

import me.uwu.eta.utils.ConsoleUtils;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        System.out.println("qdqzdqzd\nqzdqzd\nqzdiuqd");
        ConsoleUtils.clearScreen();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
                FileOutputStream(java.io.FileDescriptor.out), "ASCII"), 512);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            out.write("abcdefghijk ");
            out.write(String.valueOf(i));
            out.write('\n');
        }
        out.flush();
        System.err.println("Loop time: " +
                (System.currentTimeMillis() - start));
    }
}
