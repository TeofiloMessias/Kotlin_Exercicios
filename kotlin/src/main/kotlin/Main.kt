fun converteAnos(anos: Int){
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}
fun caracteres(str: String) = str.length
fun cubo(cubo: Int) = cubo * cubo * cubo
fun milhasKm(milhas:Float) = milhas * 1.6f

fun ex5(str: String){
   // println(str.replace("A", "x").replace("a","x").lowercase())
  //  println(str.lowercase().replace("a", "x"))
    println(str.replace("a","x",true).lowercase())
}


fun main() {
    //converteAnos(2)
   println( caracteres("Teofilo"))
    println(cubo(3))
   println( ex5("AAAAaaaaaaAsasaA"))
    }
