public class App
{
    public static void main(String[] args) throws Exception
    {
        ClientePF clientepf1 = new ClientePF("gustavo", "r. alameda nova 134", "109.123.543-85");
        ClientePJ clientepj1 = new ClientePJ("guilherme", "r. hugo gusso 266 ", "109.610.809-73");

        System.out.println(clientepf1.getNome() +"| "+ clientepf1.getCpf());
        System.out.println();

    }
}
