package org.example;

import java.io.*;

public class Fumar_porros extends Thread{

    public void run () {

        new File(".text"+Main.i+".txt");
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(".text"+Main.i+".txt")));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 10000000 ; i++) {
            try {
                dos.writeUTF(Main.elString);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.interrupt();
    }


}
