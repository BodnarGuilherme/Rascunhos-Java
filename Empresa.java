import java.util.Scanner;

public class Empresa {  

        int categoria;
        int nivelProgramador;
        int horasTrabalhadas;
        int diasTrabalhados;

        public static void programador(int nivelPrograd, int hrsTra, int diasTrab)
        {
            int horas = 2;
            int dias = 2;

            if(nivelPrograd == 1)
            {
                int res = horas * dias;
                System.out.println("Junior: " + res);
            }
            else if(nivelPrograd == 2)
            {
                System.out.println("Pleno");
            }
            else if(nivelPrograd == 3)
            {
                System.out.println("Senior");
            }
            
        }

        public static void calculo(int hrsTra, int diasTrab)
        {
            
        }

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        
        int categoria = 0;
        int nivelProg = 0;
        int hrsTrab;
        int diasTrabr;

        System.out.println("--------------MENU----------------");
        System.out.println("Qual a categoria do funcionario? ");
        System.out.println("1. Programador ");
        System.out.println("2. Gerente ");
        System.out.println("3. Vendedor ");
        System.out.println("----------------------------------");

        categoria = cin.nextInt();
        
        if(categoria == 1)
        {
            System.out.println("----------------------------------");
            System.out.println("Qual seu nivel de programador? ");
            System.out.println("1. Junior ");
            System.out.println("2. Pleno ");
            System.out.println("3. Senior ");
            System.out.println("----------------------------------");

            nivelProg = cin.nextInt();

            System.out.println("-----------CALCULO----------------");
            System.out.println("Quantas horas foram trabalhadas? ");
            hrsTrab = cin.nextInt();
            System.out.println("Quantos dias foram trabalhados? ");
            diasTrabr = cin.nextInt();
            System.out.println("----------------------------------");
            
            System.out.println();
        
        }
        else if(categoria == 2)
        {

        }
        else if(categoria == 3)
        {

        }
        else
        {
            System.out.println("Opcao invalida!! ");
        }

        





    }


}
