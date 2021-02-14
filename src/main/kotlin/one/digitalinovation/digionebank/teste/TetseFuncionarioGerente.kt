package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.Funcionario
import one.digitalinovation.digionebank.Gerente


fun main() {
    val maria = Gerente("maria", "12345678945", 200.0, "123456")
    ImprimerelatorioFuncionario.imprime(maria)

    TesteAutenticacao().login(maria)
}