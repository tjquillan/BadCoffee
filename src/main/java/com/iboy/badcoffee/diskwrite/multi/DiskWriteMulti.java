package com.iboy.badcoffee.diskwrite.multi;

import com.iboy.badcoffee.diskwrite.FileHandler;

import java.io.IOException;

public class DiskWriteMulti {

    public static void main(String[] args) throws IOException {
        FileHandler file;

        file = new FileHandler();
        int n = 0;
        while (true) {
            file.make("file" + n);

            file.write("allworkandnoplaymakesjackadullboy");
            file.close();
            n++;
        }
    }

}
