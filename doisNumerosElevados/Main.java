import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int base, expoente;

    System.out.println("Digite o primeiro numero para a base: ");
    base = sc.nextInt();
    System.out.println("Digite o segundo numero para o expoente: ");
    expoente = sc.nextInt();
    System.out.println("O numero "+ base + " elevado ao numero " + expoente + " e " + Math.pow(base, expoente));
  }
}