package one.digitalinovation.digionebank

class Pessoa {
    var nome:String = "Caio"
    var cpf:String = "123.123.123.14"

    inner class Endereco() {
        val rua:String = "Rua teste"
    }
}

fun main() {
    val caio = Pessoa()

    println(caio.nome)
    println(caio.cpf)

    println(caio.Endereco().rua)
}