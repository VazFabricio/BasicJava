import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A,B,aux = 0;

    System.out.println("Digite valor de A: ");
    A = sc.nextInt();
    System.out.println("Digite valor de B: ");
    B = sc.nextInt();

    aux = A;
    A = B;
    B = aux ;

    System.out.println("A: " + A);
    System.out.println("B: " + B);
  }
}