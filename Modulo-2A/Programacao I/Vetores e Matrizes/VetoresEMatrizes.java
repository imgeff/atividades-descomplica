import javax.swing.*;

class VetoresEMatrizes {
  int index;
  double[] numeros = new double[50];
  double media;
  double soma = 0;
  public static void main(String entrada[]) {
    double resultado = new VetoresEMatrizes().calcularMedia();
    String message = "A média das 50 notas digitadas é: " + resultado;
    JOptionPane.showMessageDialog(null, message);
  }

  public double calcularMedia() {
    for (index = 0; index <= 49; index++) {
      double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
      numeros[index] = numero;
      soma += numero;
    }

    media = soma / 50;
    return media;
  }
}