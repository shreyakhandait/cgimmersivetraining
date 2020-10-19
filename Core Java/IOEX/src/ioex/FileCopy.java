package ioex;

import java.io.*;

public class FileCopy {

    public static void main(String args[]) {
        FileCopy example = new FileCopy();
        File input = new File("C:\\Users\\User\\Desktop\\Capgemini\\Experiment");
        File output = new File("C:\\Users\\User\\Desktop\\Capgemini\\input.txt");
        example.copy(input, output);

    }

    void copy(File input, File output) {
        InputStream fin = null;
        OutputStream fos = null;
        try {
            int count=0;
            fin = new FileInputStream(input);
            fos = new FileOutputStream(output);
            int readByte;
            while ((readByte = fin.read()) > 0) {
                fos.write(readByte);
                count++;
            }
            System.out.println("no of bytes written="+count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}