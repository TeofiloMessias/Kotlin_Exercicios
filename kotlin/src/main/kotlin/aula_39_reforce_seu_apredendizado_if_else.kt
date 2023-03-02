/*
Exercicio 1->
    Escreva um programa capaz de ler dois números inteiros que representam os dados de uma figura
    geométrica.Informar se formam um quadrado(lados iguais)
 */
fun quadrado(n: Int) {
    val n1 = readln()
    val n2 = readln()
    if (n1 == n2) {
        println("É um quadrador")
    } else {
        println("Não é quadrado")
    }
}


fun equilatero() {
    println("Informe o lado 1")
    val lado1 = readln()
    println("Informe o lado 2")
    val lado2 = readln()
    println("Informe o lado 3")
    val lado3 = readln()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""
        && lado3 != null && lado3 != "") {
        val a = lado1.toString()
        val b = lado2.toString()
        val c = lado3.toString()

        if (a == b && b == c) {
            print("É um triangulo")
        } else {
            print("Não é um triangulo")
        }
    }
}

fun main() {
   // quadrado()
    equilatero()
}
