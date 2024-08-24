class Cliente {
  String CPF;
  String nome;
  String email;

  public void emitirCertificado() {
    System.out.println("Certificado Emitido");
  }
}

class Profissional {
  String CPF;
  String nome;
  String email;
  String matricula;

  public void analisarPedido() {
    System.out.println("Pedido analisado");
  }
}

