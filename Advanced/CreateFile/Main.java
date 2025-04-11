package Advanced.CreateFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\\\Users\\\\danie\\\\GitHub\\\\Curso-de-Java\\\\Advanced\\\\CreateFile\\BD.sql");
            //FileWriter fw = new FileWriter(f);
            Scanner sc = new Scanner(f);
            //fw.write("SELECT * TABLES FROM db;");
            //f.delete();
            if (f.exists()) {
                System.out.println("File name: " + f.getName());
                System.out.println("Absolute path: " + f.getAbsolutePath());
                System.out.println("Writeable: " + f.canWrite());
                System.out.println("Readable " + f.canRead());
                System.out.println("File size in bytes " + f.length());
            } 
            //fw.close();
            while (sc.hasNextLine()) {
                String dt = sc.nextLine();
                System.out.println(dt);
            }
            sc.close();
            //f.createNewFile();
            
            System.out.println("created " + f.getName());
            //f.delete();
        } catch (IOException e) {
            System.out.println("my error " + e);
        }
    }
}
