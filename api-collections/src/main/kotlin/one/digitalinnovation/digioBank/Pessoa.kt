package one.digitalinnovation.digioBank

class Pessoa {
    var nome: String = "Jether" //variavel publica
    var cpf: String = "123.456.789-10" //variavel privada
    private set
}

fun main() {
    val jether = Pessoa()

    println(jether)
    //jether.cpf = "4321"
    println(jether.nome)
    println(jether.cpf)

}