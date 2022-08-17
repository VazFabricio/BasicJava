import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        int numero;
        int cont;
        cont = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual número você quer saber a Tabuada? ");
        numero = sc.nextInt();
        while (cont < 11){
            System.out.println(cont + " x " + numero + " = " + cont * numero);
            cont++;
        }

    }
}
