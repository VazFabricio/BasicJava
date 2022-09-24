import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    int count;
    int soma = 0;
    int [] numeros = new int[4];
    
    System.out.println("---Soma 4 numeros---");

    for (count = 0; count < 4;count++){
      System.out.print("Digite um numero: ");
      numeros [count] = sc.nextInt(); 
      soma = numeros [count] + soma;
    }
    
    System.out.println(" A soma dos 4 numeros é: " + soma);
  }
}