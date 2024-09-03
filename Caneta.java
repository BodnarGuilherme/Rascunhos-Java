import java.util.Scanner;

public class Caneta
{
    //Atributos da caneta
    private int carga; 
    //Metodos para usar a caneta
    public Caneta(int carga)
    {
        this.carga = carga;
    }

    public boolean temTinta()
    {
        return this.carga >= 1;
    }

    public boolean nTemTinta()
    {
        return this.carga <= 0;
    }

    public int rabiscar(int carga)
    {
        //Aqui vai usar apenas se for setar quanto que cada escrita irá diminuir:
        // carga = carga - texto;
        this.carga = carga;

        if(carga > 0)
        {
            System.out.println("A Carga da sua caneta e: " + carga);
            carga -= 1;
            System.out.println(carga);
        }
        else
        {
            System.out.println("Caneta sem tinta igual: " + carga);
        }
        return carga;
    }

        public static void main(String[] args) 
        {
            Scanner scanner = new Scanner(System.in);
            Caneta pen1 = new Caneta(10);

            pen1.rabiscar(100);
            
            for(int i = 0; i <= 100; i ++)
            {
                pen1.rabiscar(10); 
                System.out.println(pen1);
            }
        }
    
}

//             // Chamei dois metodos
//             pen1.temTinta();
//             pen1.nTemTinta();
//             // Vai verificar se tem tinta
//             if(pen1.temTinta() == true)
//             {
//                 System.out.println("-----------------------------------");
//                 System.out.println("Tem " + pen1.carga + " de tinta");
//                 System.out.println("-----------------------------------");
//             }
//             else if (pen1.nTemTinta() == true)
//             {
//                 System.out.println("-----------------------------------");
//                 System.out.println("Acabou a tinta ");
//                 System.out.println("-----------------------------------");
//             }        
        
//             pen1.rabiscar(2);

//         }   
//     }
// }
//  for(int i = 0; i <= 100; i ++){

//             pen1.escrever(10); 
//         }

//            System.out.println(pen1);



// int opc = 0;

//             while(opc != 2)
//             {
//                 System.out.println("=== MENU ===");
//                 System.out.println("1. digite (1) para escrever ");
//                 System.out.println("2. digite (2) para sair ");
//                 System.out.println("===      ====");

//                 opc = scanner.nextInt();

//                 switch (opc)
//                 {
//                 case 1:
//                     System.out.println("Vc escolheu opc 1. ");
//                     break;
//                 case 2:
//                     System.out.println("Saindo do programa. ");
//                     break;
//                 default:
//                     System.out.println("Opcao invalida. ");
//                     break;
//                 }
        
//             }
//             scanner.close();