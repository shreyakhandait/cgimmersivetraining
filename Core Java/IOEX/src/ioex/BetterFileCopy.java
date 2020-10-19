package ioex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BetterFileCopy {

	public static void main(String args[]) {
        BetterFileCopy example = new BetterFileCopy();
        File input = new File("C:\\Users\\User\\Desktop\\Capgemini\\Experiment\\input.txt");
        File output = new File("C:\\Users\\User\\Desktop\\Capgemini\\Experiment\\output.txt");
        example.copy(input, output);

    }

    void copy(File input, File output) {
        InputStream fin = null;
        OutputStream fos = null;
        BufferedInputStream bin=null;
        BufferedOutputStream bout=null;
        try {
            fin = new FileInputStream(input);
            bin=new BufferedInputStream(fin);
            fos = new FileOutputStream(output);
            bout=new BufferedOutputStream(fos);
            int readBytesCount;//contains count of the bytes read
            int totalBytescount=0;
            byte data[]=new byte[1000];
            while ((readBytesCount=bin.read(data))>0) {
                bout.write(data,0,readBytesCount);
               totalBytescount=totalBytescount+readBytesCount;
            }
            System.out.println("no of bytes written="+totalBytescount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(bin);
            close(fin);
            close(bout);
            close(fos);

        }
    }

    void close(InputStream stream){
        try{
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    void close(OutputStream stream){
        try{
            stream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
