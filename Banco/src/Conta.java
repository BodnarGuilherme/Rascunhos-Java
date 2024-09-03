public class Conta
{

    private String nome;
    public String cpf;
    private double saldo;

    public Conta()
    {
        saldo = 0.0;
    }

    public Conta(String nome, String cpf)
    {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Double getSaldo()
    {
        return saldo;
    }

    public void setDepositar(double valor)
    {
        saldo = saldo + valor;
    }
    public void setSacar(double valor)
    {
        if (saldo < valor)
        {
            System.out.println("Saldo insuficiente!! ");
        }else
        {
            saldo = saldo - valor;
        }
        
    }
}
