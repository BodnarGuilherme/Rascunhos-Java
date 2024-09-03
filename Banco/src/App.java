public class App
{
    public static void main(String[] args) throws Exception
    {
        Conta c = new Conta();
        Conta g = new Conta();


        // c.nome = "gabriel";
        c.cpf = "1234598359942";
        // c.saldo = 10.00;
        // g.nome = "guilherme";

        System.out.println(c.getNome());
        System.out.println(" -- / -- ");
        c.setNome("Alex");
        System.out.println(c.getNome());

        // System.out.println(c.nome);
        // System.out.println(g.nome);

        // System.out.println(c.getSaldo());

        // System.out.println("                    ");
        // c.setDepositar(15.0);

        // System.out.println(c.getSaldo());

        // c.setSacar(16.0);
        // System.out.println(c.getSaldo());


        // c.setDepositar(10.0);
        // System.out.println(c.nome);
        // System.out.println(c.cpf);

        // System.out.println(c.getSaldo());

        // System.out.println("-----");
        // c.setSacar(8.0);
        // System.out.println(c.getSaldo());
        // c.setSacar(1);
        // System.out.println(c.getSaldo());
        // c.setSacar(5);
        // System.out.println(c.getSaldo());

    }
}
