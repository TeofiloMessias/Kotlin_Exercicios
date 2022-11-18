import java.lang.ArithmeticException

fun main(){

    try {

        var s: String? = null
        var a = 10/0
        println(s!!.length)
    }catch (e: NullPointerException){
    println("Varialvel nula !")
    }catch (e: ArithmeticException){
        println("Impossível dividir dez por zero")
    }catch (e: Exception) {
        // A excecção Exception é a mais generica
        println("Generica")
    }finally {
            // O finally é executado sempre e é opcional
            println("O finally é executado sempre")
        }
    println("Fim...")
    }