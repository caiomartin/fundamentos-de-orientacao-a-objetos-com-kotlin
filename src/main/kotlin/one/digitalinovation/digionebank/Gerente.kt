package one.digitalinovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculeAuxlio(): Double = salario * 0.4

    override fun login(): Boolean = "123456" == senha

}