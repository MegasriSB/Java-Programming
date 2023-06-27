package Set_3;
import java.io.*;
public class TextFile {
    public static void main (String[] args) throws IOException {
            File filein = new File("D:\\Java\\bye.txt");
            File fileout = new File("D:\\Java\\jav.txt"); 
            char CharCounter = 0;       
            BufferedReader in = (new BufferedReader(new FileReader(filein)));
            PrintWriter out = (new PrintWriter(new FileWriter(fileout)));
            int z;
            while ((z = in.read()) != -1){
                char c=(char)z;
                if (Character.isUpperCase(c)){
                    Character.toLowerCase(c);
                }
                out.write(c);
            }
            in.close();
            out.close();
        }       
    }
