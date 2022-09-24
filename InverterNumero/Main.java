import java.util.Scanner;
class Main {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  int numero, centena, dezena, unidade;
  String inverso;

  System.out.print("Digite um numero de 3 digitos: ");
  numero = sc.nextInt();

  unidade = numero % 10;
  numero = (numero - unidade)/10;

  dezena = numero % 10;
  numero = (numero - dezena)/10;

  centena = numero % 10;
  numero = (numero - centena)/10;

  String unidadeS = String.valueOf(unidade);
  String dezenaS = String.valueOf(dezena);
  String centenaS = String.valueOf(centena);
  inverso = unidadeS + dezenaS +  centenaS;
  
  System.out.println("Seu numero invertido e: " + inverso);
  }
}