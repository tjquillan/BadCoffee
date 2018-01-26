package com.iboy.badcoffee.diskwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private FileWriter fw;
    private BufferedWriter bw;

    public FileHandler() {

    }

    public void make(String name) throws IOException {
        fw = new FileWriter(name);
        bw = new BufferedWriter(fw);
    }

    public void write(String text) throws IOException {
        bw.write(text);
        bw.flush();
    }

    public void writeln(String text) throws IOException {
        bw.write(text);
        bw.newLine();
        bw.flush();
    }

    public void close() throws IOException {
        bw.close();
        fw.close();
    }
}
