public class ClientePJ extends Cliente
{
    private String cnpj;

    //METEDO CONSTRUTOR
    public ClientePJ(String nome, String endereco, String cnpj)
    {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj()
    {
        return cnpj;
    }
    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }
}
