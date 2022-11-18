fun main(){
    var s = "Kotlin"
    var i = 50

    while (i > 0){
        println(i)
        i--
    }
    while (i < s.length){
        println("${s[i]}")
        i++
    }
}