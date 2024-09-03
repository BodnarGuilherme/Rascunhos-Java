public class Conventer {
    public static void main(String[] args) {
        //Converter String para Inteiro
        String string1 = "18";
        int inteiro1;

        inteiro1 = Integer.parseInt(string1);
        System.out.println(" ");        
        System.out.println("Convertido String para inteiro: " + inteiro1);

        //Converter Double para String
        Double double1 = 192.00;
        String string2;

        string2 = Double.toString(double1);
        
        System.out.println("Convertido Double para String: " + string2);
        
        //Converter Float para String
        float float1 = 10;
        String string3;

        string3 = Float.toString(float1);
        System.out.println("Convertido Float para String: " + string3);
        
        //Converter Interger para string

        int inteiro2 = 10;
        String string4;

        string4 = Integer.toString(inteiro2);
        System.out.println("Convertido Interger para String: " + string4);

        //Converter String para double

        String string5 = "10.1";
        Double double2;
        
        double2 = Double.parseDouble(string5);
        System.out.println("Convertido String para Double: " + double2);

        //Converter String para Interger

        String string6 = "2";
        int inteiro3;
        
        inteiro3 = Integer.parseInt(string6);
        System.out.println("Convertido String para Interger: " + inteiro3);

        //Converter String para float

        String string7 = "3";
        float float2;

        float2 = Float.parseFloat(string7);
        System.out.println("Convertido String para Float: " + float2);

        //Converter Interger para bollean

        int inteiro4 = 5;
        boolean bollean1 = (inteiro4 != 0);

        System.out.println("Convertido Interger para Bollean: " + bollean1);

        //Converter Interger para ASCII

        int ascii = 65;
        char character = (char) ascii;

        System.out.println("Convertido: " + ascii + " Para: " + character);
    }
    //@Bodnar
}