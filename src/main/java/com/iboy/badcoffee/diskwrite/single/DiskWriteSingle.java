package com.iboy.badcoffee.diskwrite.single;

import com.iboy.badcoffee.diskwrite.FileHandler;

import java.io.IOException;
import java.util.Random;

public class DiskWriteSingle {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        FileHandler file = new FileHandler();

        file.make("file");

        while (true) {
            file.writeln(String.valueOf(rand.nextInt(1000000000)));
        }
    }
}
