package Advanced.CreateFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\\\Users\\\\danie\\\\GitHub\\\\Curso-de-Java\\\\Advanced\\\\CreateFile\\BD.sql"); //Importar uma classe File para criar um arquivo .sql em uma pasta especifica
            
            f.createNewFile(); //Cria o arquivo
            
            System.out.println("created " + f.getName());

            FileWriter fw = new FileWriter(f); //Cria uma nova instancia para escrever no arquivo passado por parametro

            Scanner sc = new Scanner(f); //Cria umaa nova instancia para escanear/ler arquivo passado por parametro

            String t = "TABLES"; //Possivel concatenar para futura manipulacao de DB

            fw.write("SELECT * " + t + " FROM db;"); //Escreve codigo SQL no arquivo .sql
            
            if (f.exists()) { //Verifica se ele existe 
                System.out.println("File name: " + f.getName());
                System.out.println("Absolute path: " + f.getAbsolutePath()); //Printa o diretorio completo
                System.out.println("Writeable: " + f.canWrite()); //Boolean se pode ser escrito
                System.out.println("Readable " + f.canRead()); //Boolean se pode ser lido
                System.out.println("File size in bytes " + f.length()); //Tamanho do arquivo em Bytes
            }
            
            fw.close(); //Fecha a chamada para FileWriter, qualquer outra chamada pra ele vai retornar erro

            while (sc.hasNextLine()) { //retorna verdadeiro se existir uma/mais linhas no arquivo
                String dt = sc.nextLine(); //Passa para proxima linha dentro do arquivo
                System.out.println(dt);
            }

            sc.close(); //Fecha a chamada para Scanner, qualquer outra chamada pra ele vai retornar erro
            
            f.delete(); //Deleta o aquivo/diretorio e retorna true
        } catch (IOException e) {
            System.out.println("my error " + e);
        }
    }
}
