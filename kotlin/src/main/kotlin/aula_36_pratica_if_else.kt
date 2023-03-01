/*
Exercicio 1->
    Escreva um programa para ajudar a empres XPTO calcular o bônus que os funcionários receberão no final do
    ano. Os bonus são classificados pro cargo

 */
fun exercicio1(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus
}

/*
Exercicio 2->
Modifique o primeiro exercicio para considerar o tempo de experinecia no calculo de bônus.

    a. Gerente com menos de 2 anos de experiencia recebem R$ 2.000,00 caso contrário recebbem
 R$ 3.000,00
    b. Coordenadores com menos de 1 ano de experiencia recebem R$ 1.500,00 caso contrario recebem
 R$ 1.800,00
    c. Engenheiro de software recebem R$ 1.000,00
    d. Estagiários recebem R$ 500,00
 */
fun exercicio2(cargo: String, experiencia: Int): Float {
    var bonus = 0f

    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus
}

/*
Exercicio 3->
Qual o resultado das comparações abaixo?
    A. [ a = false     b = false    c = true    d = true ]
        a. (a && b && c && d)

    B. [ a = false     b = false    c = true    d = true ]
        b. (!a && !b && (c && d))

    C. [ a = false     b = false    c = true    d = true ]
        c. (a && ((b || c) || d))

    D. [ a = false     b = false    c = true    d = true ]
        d. (a || ((!b && c) || !d))
 */
fun exercicio3() {
    val a = false
    val b = false
    val c = true
    val d = true
    println((a && b && c && d))
    // false && false
    // false
    println((!a && !b && (c && d)))
    // true && true && true
    // true
    println((a && ((b || c) || d)))
    //false &&
    // false
    println((a || ((!b && c) || !d)))
    //false ||( true|| false))
    //  false|| true
    // true
}

fun main() {
    /* val exercicio2 = exercicio2("dasdasda",3)
     if(exercicio2 == 0f){
         println("Cargo incorreto")
     }*/
    print(exercicio2("Gerente", 1))
    println()
   println( exercicio3())
}