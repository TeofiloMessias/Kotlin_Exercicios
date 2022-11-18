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

        if (x == y) {
            println("É um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
    }
}

fun qualASaida(num: Int) {
    if (num > 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}


fun portaria() {
    println("Bem vindo a festa, qual sua idade ")

    val idade = readln()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos. ")
            return
        }
    }
    println("Qual é o tipo de convite? ")
    var tipoConvite = readln()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {

            println("Qual é o código do convite? ")
            var codigo = readln()
            if (codigo != null && codigo != "") {
                codigo = codigo.lowercase()
                if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                    println("Welcome :")
                } else if (tipoConvite == "premium" || tipoConvite == "luxo"
                    && codigo.startsWith("xl")
                ) {
                    println("Welcome :")
                } else {
                    println("Negado. Convite inválido")
                }

            }
        } else {
            println("Negado. Convite inválido")
            return
        }

    }

}

fun main() {
    // quadrado()
    // triangulo()
    //  qualASaida(4)
    portaria()
}