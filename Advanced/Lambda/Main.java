/* package Advanced.Lambda;

interface StringFunction {
    String run(String str);
}

public class Main {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

/* import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);

        Consumer<Integer> consumido = (ar) -> { //Atribui a expressao Lambda dentro da variavel
            System.out.println(ar);
        };
        
        array.forEach(consumido);

        array.forEach( (elearr) -> {
            System.out.println(elearr);
        } );
    }
}
 */