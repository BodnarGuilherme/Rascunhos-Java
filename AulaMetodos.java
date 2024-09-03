public class AulaMetodos {

    static void SemParametro() {
        System.out.println("Ola mundo! ");
    }
    static void ComParametro(int numero) {
        int var = numero;
        System.out.println("O valor atribuido e: " + var);
    }
    static int Retornar(int n1, int n2) {
        int var1 = n1;
        int var2 = n2;
        int soma = n1 + n2;

        System.out.println("A soma é " + soma);
        return soma;
    }
    public static void main(String[] args) {
        
        SemParametro();
        ComParametro(1);
        Retornar(0, 0);



    }
}