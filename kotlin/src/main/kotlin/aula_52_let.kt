// com o LET a sua variável se torna It

fun main(){
    var str: String? = null

    str?.let {
        it.lowercase()
        it.length
    }
// a variável sendo tratada da forma tradicional com If
    if (str != null){
        str.lowercase()
        str.length
    }

}