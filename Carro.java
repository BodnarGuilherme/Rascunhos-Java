public class Carro {
    
        String marca;
        String modelo;
        int ano;
        boolean ligado = false;
        int velocidade = 0;
        //boolean desligado = false;
        //boolean acelerando = false;
        boolean freando = false;

    public boolean ligar(){
        System.out.println("Carro esta ligado ");
        return true;
    }
    public boolean desligar(){
        System.out.println("Carro esta desligado");
        return true;
    }
    public int acelerar(int vel){

        
            velocidade = velocidade + vel;
        
      
            System.out.println("O carro esta desligado....");
        
        //System.out.println("Carro esta acelerando");
        return velocidade;
    }
    public boolean frear(){
        System.out.println("Carro esta freando");
        return true;
    }

    public static void main(String[] args) {
        boolean lig;
        Carro car1 = new Carro();
        
        car1.marca = "Chevrolet";
        car1.modelo = "Cruze";
        car1.ano = 2018;
        lig = car1.ligar();

        if(lig){
            System.out.println(car1.acelerar(10));
        }
        else{
            System.out.println("carro desligado....");
        }
        //car1.desligar();
        //car1.acelerar();
        //car1.frear();
        

    }
}