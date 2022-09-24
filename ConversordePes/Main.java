import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double pes, polega, jarda, milha = 0.0;
 
    System.out.println("Digite um numero em pes : ");
    pes = sc.nextDouble();

    polega = pes * 12;
    jarda = pes * 3;
    milha = pes / (3*1760);

    System.out.printf(pes + " pes em polegadas: %.2f", polega);
    System.out.println(" ");
    System.out.printf(pes +" pes em jardas: %.2f", jarda);
    System.out.println(" ");
    System.out.printf(pes + " pes em milhas: %.2f", milha);
  }
}