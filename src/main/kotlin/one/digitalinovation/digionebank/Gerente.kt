package one.digitalinovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculeAuxlio(): Double = salario * 0.4

}