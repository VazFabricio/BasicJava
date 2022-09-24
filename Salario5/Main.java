import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);

    double salarioBase, salarioFinal = 0.0;
    double  gratificacao,imposto = 0.0;

    System.out.println("Salario atual :");
    salarioBase = sc.nextDouble();

    gratificacao = (salarioBase + 50);
    imposto = (salarioBase * 0.1);
    salarioFinal = (salarioBase + gratificacao) - imposto ;

    System.out.println("Salario a receber e R$ " + salarioFinal);
  }
}