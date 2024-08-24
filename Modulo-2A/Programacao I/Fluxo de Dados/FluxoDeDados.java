import javax.swing.JOptionPane;

class FluxoDeDados {
  public static void main(String entrada[]) {
    int primeiroNumero, segundoNumero;
    double quocienteDivisao, potencia;
    String mensagemSaida = "";

    primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
    segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

    quocienteDivisao = (double)primeiroNumero / (double)segundoNumero;
    potencia = Math.pow((double)primeiroNumero, (double)segundoNumero);

    mensagemSaida = String.format("O quociente da divisão de %d por %d é igual á %f \n", primeiroNumero, segundoNumero, quocienteDivisao);
    mensagemSaida = mensagemSaida + String.format("A potência de %d elevado á %d é igual á %f \n", primeiroNumero, segundoNumero, potencia);

    JOptionPane.showMessageDialog(null, mensagemSaida);

    System.exit(0);
  }
}