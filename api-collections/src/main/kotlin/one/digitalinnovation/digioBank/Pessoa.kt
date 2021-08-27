package one.digitalinnovation.digioBank

class Pessoa {
    var nome: String = "Jether" //variavel publica
    var cpf: String = "123.456.789-10" //variavel privada
    private set

    constructor()

    fun pessoaInfo() = "$nome, $cpf"
}

fun main() {
    val jether = Pessoa()
    println(jether.pessoaInfo())



}