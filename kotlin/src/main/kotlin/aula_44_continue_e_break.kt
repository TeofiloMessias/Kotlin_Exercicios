fun numero() {
    var i = 0
    while (i < 1000000000) {

        if (i == 50) {
            break
        }
        println("$i ")
        i++
    }
}

fun continua(){
    var i = 0
    while (i < 80){
        if (i < 50){
            i++
            continue
        }
        println("$i ")
        i++

    }
}

fun main() {
    //numero()
    continua()
}