import java.util.Scanner;

public class Soma
{

    public static int somar(int n1, int n2)
    {
        int res = n1 + n2;
        return res;
        
    }
    
    public static void main(String[] args) {
        
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira um o primeiro numero: ");
        num1 = scanner.nextInt();
        System.out.println("Insira o segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("Resultado da soma: " + somar(num1, num2));
    }
}