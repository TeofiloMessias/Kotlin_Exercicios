

fun portariaDebug() {
    println("Bem vindo a festa, qual sua idade ")

    val idade = readln()

    if (idade != null && idade != "") {
        if (idade.toInt() < 48) {
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
    portariaDebug()
}