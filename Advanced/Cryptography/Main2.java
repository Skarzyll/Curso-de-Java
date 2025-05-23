package Advanced.Cryptography;

import org.mindrot.jbcrypt.BCrypt;

public class Main2 {
    public static void main(String[] args) {
        String senha = "minhasenha";

        String hash = BCrypt.hashpw(senha, BCrypt.gensalt(12));

        System.out.println(hash);
        boolean corr = BCrypt.checkpw(senha, hash);

        System.out.println(corr);
    }
}
