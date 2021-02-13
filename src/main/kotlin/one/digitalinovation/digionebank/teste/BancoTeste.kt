package one.digitalinovation.digionebank.teste

import one.digitalinovation.digionebank.Banco

fun main(){
    val digiOnebank = Banco("DigiOne", 12)

    println(digiOnebank.nome)
    println(digiOnebank.numero)

    val banco2 = digiOnebank.copy("banco2")
    println(banco2.nome)
    println(banco2.numero)

    println(banco2.info())

}