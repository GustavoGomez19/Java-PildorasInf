package Code;
import java.util.Scanner;

class Clase_Math {

    public static void main(String[] args){
        double raiz = Math.sqrt(10.5);
        System.out.println(Math.round(raiz));

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        double base = input.nextInt();
        System.out.print("Ingrese el exponente: ");
        double exponente = input.nextInt();
        int resultado = (int)Math.pow(base, exponente); //Refundición de tipo de dato (double --> int)
        System.out.println("Resultado: " + resultado);

        input.close();
    }
    
}