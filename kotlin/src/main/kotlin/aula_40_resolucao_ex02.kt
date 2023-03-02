/*Exercicio 2->
    Escreva um programa capaz de ler três numeros inteiros que representam os lados de um triangulo
    Informar se é um triangulo equilatero (todos os lados iguais
 */

fun triangulo() {
    println("Informe o lado 1: ")
    val lado1 = readln()

    println("Informe o lado 2: ")
    val lado2 = readln()

    println("Informe o lado 3: ")
    val lado3 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "" && lado3 != null && lado3 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("É um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
    }
}

fun main() {
    triangulo()
}