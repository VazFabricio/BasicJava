import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
      
    double deposito,taxa,rendimento,total;
  
    System.out.print("Valor do Deposito: R$");
    deposito = sc.nextDouble();
    System.out.print("Taxa de juros : %");
    taxa = sc.nextDouble();
  
    rendimento = deposito * (taxa /100);
    total = deposito + rendimento;
    
    System.out.println("O rendimento foi de R$"+ rendimento +" e o total foi de R$" + total);
  }
}