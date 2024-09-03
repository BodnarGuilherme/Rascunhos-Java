import java.util.Scanner;

public class Imposto 
{
   public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double[] faixasDeImposto = {0.0, 1903.98, 2826.65, 3751.05, 4664.68};
        double[] taxasDeImposto = {0.0, 0.075, 0.15, 0.225, 0.275};
        double[] deducoes = {0.0, 142.80, 354.80, 636.13, 869.36};
        
        System.out.println("Digite sua renda anual: ");
        double rendaAnual = scanner.nextDouble();
        double baseDeCalculo = rendaAnual;
        
    }
}
