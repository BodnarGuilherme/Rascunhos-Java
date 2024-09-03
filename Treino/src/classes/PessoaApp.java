package classes;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "ana");
        Pessoa pessoa2 = new Pessoa(2, "helder");


        System.out.println("o nome do objeto pessoa1 eh: " + pessoa1.getNome());
    }
}
