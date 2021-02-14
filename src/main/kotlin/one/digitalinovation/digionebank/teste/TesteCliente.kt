package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.Cliente
import one.digitalinovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.456-77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().login(jose)
}