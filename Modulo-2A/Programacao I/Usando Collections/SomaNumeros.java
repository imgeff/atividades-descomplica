import java.util.ArrayList;
import java.util.Scanner;

public class SomaNumeros {

  private ArrayList<Integer> numeros = new ArrayList<Integer>();
  private Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();
    System.out.println("Escolha uma opção:\n[1] - Inserir Números\n[0] - Finalizar Programa");
    Integer opcaoSelecionada = somaNumeros.scanner.nextInt();

    if (opcaoSelecionada == 1) {
      somaNumeros.iniciarPrograma();
    } else {
      somaNumeros.scanner.close();
      System.out.println("Fim do Programa");
      System.exit(0);
    }
  }

  public void iniciarPrograma() {
    adicionarPrimeirosNumeros();
    iniciarFluxoPrincipal();
    finalizarPrograma();
  }

  private void adicionarPrimeirosNumeros() {
    System.out.println("\nDigite um número inteiro: ");
    Integer numero = scanner.nextInt();
    numeros.add(numero);
    System.out.println("\nDigite outro número inteiro: ");
    Integer outroNumero = scanner.nextInt();
    numeros.add(outroNumero);
  }

  private void iniciarFluxoPrincipal() {
    String menu = "\nO que deseja fazer com os números inseridos:\n[1] - Inserir mais um número\n[2] - Somar todos os números inseridos\n";
    System.out.println(menu);
    Integer opcaoSelecionada = scanner.nextInt();
    while (opcaoSelecionada == 1) {
      System.out.println("\nDigite um número inteiro: ");
      Integer numeroInserido = scanner.nextInt();
      numeros.add(numeroInserido);

      System.out.println(menu);
      opcaoSelecionada = scanner.nextInt();
    }
    scanner.close();
  }

  private void finalizarPrograma() {
    Integer resultadoSoma = 0;

    for (Integer numeroSoma : numeros) {
      resultadoSoma += numeroSoma;
    }

    System.out.println("\nO resultado da soma dos números: " + numeros.toString() + " é " + resultadoSoma);
    System.out.println("Fim do Programa");
    System.exit(0);
  }
}