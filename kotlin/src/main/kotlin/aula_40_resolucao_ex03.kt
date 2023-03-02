/*Exercicio 3->
    Considere o código abaixo. Qual a saída do programa caso informado o valor 4 ?
    fun qualASaida(num: Int){
    if (num >= 0){
    if (num ==0)
    println("primeira string")
    else print("segunda string){
    println(Terceira string")
    }
 */
fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("primeira string")
        else println("segunda string")
        println("Terceira string")
    }
    println("Terceira String")
}

fun main() {
    qualASaida(4)
}