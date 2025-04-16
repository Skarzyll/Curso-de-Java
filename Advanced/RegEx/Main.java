package Advanced.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("we", Pattern.CASE_INSENSITIVE); //Atribuir a variavel do tipo Pattern uma expressão regular fornecida compilada em um padrão com os sinalizadores fornecidos

        Matcher matcher = pattern.matcher("we cant get out the car"); //Atribui a variavel uma chamada com a frase em que sera procurada

        boolean find = matcher.find(); //Retorna verdadeiro se encontrou

        if (find) {
            System.out.println("found");
        } else {
            System.out.println("nooo");
        }
    }
}
