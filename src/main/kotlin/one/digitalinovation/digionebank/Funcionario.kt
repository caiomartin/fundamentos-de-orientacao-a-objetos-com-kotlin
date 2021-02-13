package one.digitalinovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    abstract fun calculeAuxlio():Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculeAuxlio()}
    """.trimIndent()
}