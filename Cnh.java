    import java.util.Scanner;

public class Cnh
{
    public static void main(String[] args) 
    {
            // Esse programa tem como objetivo verificar se a idade dada pelo usario tem a possibilidade de tirar cnh!
            try (Scanner Idade = new Scanner(System.in))
            {
                System.out.println("=======================================");
                System.out.println("         Me informe sua idade ");
                System.out.println("=======================================");
                
                System.out.println("          Digite sua idade: ");
                int idade = Idade.nextInt();
                System.out.println("=======================================");
                System.out.println("            *Verificando*");
                System.out.println("=======================================");
                
                if(idade >= 18)
                {
                    System.out.println("Com base na sua idade de " + idade + " anos, vc esta apto a tirar carteira de motorista");
                }
                    else
                {
                    System.out.println("Com base na sua idade de " + idade + " anos, vc nao esta apto a tirar carteira de motorista");
                }
            }
    }
}
