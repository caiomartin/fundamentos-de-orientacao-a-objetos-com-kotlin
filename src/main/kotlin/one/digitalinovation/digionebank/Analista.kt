package one.digitalinovation.digionebank

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {
    override fun calculeAuxlio() = salario + 0.1
}