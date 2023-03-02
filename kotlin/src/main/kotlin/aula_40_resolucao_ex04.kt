/*Exercicio 4->
    Escreva um programa para ser usado na portaria de um evento
        a. Peça a idade. Menores de idade não são permitidos. Mensagem: "Negado.Menores de idade não são
        permitidos

        b. Peça o tipo de convite. Os tipos de convite são: comum, premium e luxo.
        Negar a entrada caso não seja nehum destes. Mensagem: "Negado.Convite inválido."

        c. Peça o código do convite. Convites premium e luxo começam com "XL". Convites comuns começam
        com "XT". Caso o código não esteja nos padroes, negar a entrada. Mensagem: "Negado. Convite invalido"

        d. Caso todos os criterios sejam satisfatorio, exibir "Welcome:)".
 */

fun portaria() {
    print("Qual sua idade? ")
    val idade = readLine()

    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}

fun main() {
    portaria()
}