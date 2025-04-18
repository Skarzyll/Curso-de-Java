package Advanced.Optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> op = Optional.empty();

        //op = Optional.of("kkkkk");

        //op.ifPresent( v -> System.out.println(v) );
        System.out.println(op.orElseGet(() -> "RISOSOSOSOS"));

        /* if (op.isEmpty()) {
            op = Optional.of("kkkk");
            System.out.println(op.get());
        } else {
            System.out.println(op.get());
        } */
    }
}
