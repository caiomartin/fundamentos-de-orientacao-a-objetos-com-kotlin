package one.digitalinovation.digionebank

class Pessoa {
    var nome:String = "Caio"
    var cpf:String = "123.123.123.14"

    private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val caio = Pessoa()

    println(caio.pessoaInfo())
}