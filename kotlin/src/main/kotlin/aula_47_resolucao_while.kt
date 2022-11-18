fun while1() {
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0
    while ((numBaloes * capBalao) + capBalao < capCaixa) {
        numBaloes++
    }
    println("Cabem $numBaloes balões na caixa d'água. ")
}

fun fizzBuzz() {
    var i = 1
    while (i <= 50) {
        if (i % 15 == 0) {
            println("FizzBuzz ")
        } else if (i % 3 == 0) {
            println("Buzz ")
        } else if (i % 5 == 0) {
            println("Fizz ")
        } else {
            println("$i ")
        }
        i++
    }
}

fun nomeInvertido(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        println(str[i])
        i--
    }
}

fun qtdecaracteres(str: String): Boolean {
    //O boolean é o retorno
    var strLower = str.lowercase()
    var countx = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (str[i] == 'x') {
            countx++
        } else if (str[i] == 'o') {
            countO++
        }
        i++
    }
    return ((countx == countO )&& (countO != 0))
}


fun main() {
    // while1()
    // fizzBuzz()
    //  nomeInvertido("Meu nome é Teofilo")
    println(qtdecaracteres("XxxoOo"))
    println(qtdecaracteres("xxxxox"))
    println(qtdecaracteres("dtefghjij"))
    println(qtdecaracteres("0000xzzzzz"))
}