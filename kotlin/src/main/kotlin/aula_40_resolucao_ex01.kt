/*Exercicio 1->
Escreva um programa capaz de ler dois números inteiros que representam os dados de uma figura
geométrica.Informar se formam um quadrado(lados iguais)
*/
fun quadrado() {
    println("Informe o lado 1: ")
    val lado1 = readln()

    println("Informe o lado 2: ")
    val lado2 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}


fun main() {
   quadrado()


}