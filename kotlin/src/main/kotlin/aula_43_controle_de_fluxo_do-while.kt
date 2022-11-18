fun exemplowhile() {
    var i = 0

    do {
        println("$i ")
        i++
    } while (i == 1000)

    while (i == 100) {
        println("while")
    }
}

fun nome(){
    do {
        println("Qual é o seu nome: ? ")
        val value = readln()
    }while (value == "")
}
fun main() {
    nome()
}