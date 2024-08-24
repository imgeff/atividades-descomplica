class Funcionario {
  constructor(nome, idade, cargo) {
    this.nome = nome;
    this.idade = idade;
    this.cargo = cargo;
  }

  seApresentar() {
    console.log(`Oi! meu nome é ${this.nome}, tenho ${this.idade} anos e trabalho como ${this.cargo}`)
  }

  trabalhar() {
    console.log(`Trabalhando como ${this.cargo}...`)
  }
}

class Desenvolvedor extends Funcionario {
  constructor(nome, idade, cargo, linguagem) {
    super(nome, idade, cargo);
    this.linguagem = linguagem;
  }

  programar() {
    console.log(`Criando e resolvendo bugs em ${this.linguagem}...`)
  }
}

class Gerente extends Funcionario {
  constructor(nome, idade, cargo, departamento) {
    super(nome, idade, cargo);
    this.departamento = departamento;
  }

  gerenciar() {
    console.log(`Gerenciando o departamento ${this.departamento}...`);
  }
}

const bob = new Desenvolvedor('Robert C. Martin', 71, 'Consultor internacional', 'COBOL');
const bill = new Gerente('William H. Gates III', 67, 'Diretor Executivo', 'Tecnologia');

bob.seApresentar();
bob.trabalhar();
bob.programar();

bill.seApresentar();
bill.trabalhar();
bill.gerenciar();