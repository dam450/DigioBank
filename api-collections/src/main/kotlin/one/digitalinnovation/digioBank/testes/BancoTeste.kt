package one.digitalinnovation.digioBank.testes

import one.digitalinnovation.digioBank.Banco

fun main() {
    val digioBank = Banco( nome = "DigiOne", numero = 12)

    //println(digioBank.nome)
    //println(digioBank.numero)
    println(digioBank.info())

}