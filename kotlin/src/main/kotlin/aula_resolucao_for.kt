fun ex001() {

    for (i in 1..50) {
        println("$i ")
    }
}
fun ex002() {
    for (i in 50 downTo 1)
        println("$i ")
}
fun ex003() {

    for (i in 1..50) {

        if (i % 5 != 0) {
            println("$i ")
        }
    }
}
fun ex004(){
    for (i in 1..50){
        if (i % 5 == 0){
            continue
        }
        println("$i ")
    }
}
fun ex005(){
    var soma = 0
    for (i in 1..500){
        soma = soma + i
    }
    println(soma)
}
fun ex006(n: Int){
    for (i in 1..n){ // 1-5
        for (j in 1..i){ // 1..5
            println("#")
        }
        println()
    }
}

fun main() {
    //ex001()
    //ex002()
    //ex003()
    //ex004()
    //ex005()
    ex006(5)
}