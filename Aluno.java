import java.util.Scanner;
public class Aluno 
{
    public static void main(String[] args) 
    {
        float nota1, nota2, media;

        Scanner ler = new Scanner(System.in); 

        System.out.println("Insira a primeira nota: ");
        nota1 = ler.nextFloat();
        System.out.println("Insira a segunda nota: ");
        nota2 = ler.nextFloat();
        media = (nota1 + nota2)/2;

        if(media >= 6 )
        {
            System.out.println("Aluno aprovado");
        }
        else if (media >= 4 && media <= 5.9)
        {
            System.out.println("Aluno está de recuperacao!! ");
        }
        else if (media < 4)
        {
            System.out.println("Aluno reprovado :c ");
        }
        
    }
}
