fun bonus(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}

fun ex01(cargo: String, experiencia: Int): Float {
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
        }
    } else if (cargo == "Engenheiro de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }
    return bonus
}


fun main() {
    val bonus = bonus("Gerente")
    println(bonus)
    println("Gerente")
    println(ex01("Coordenador", 1))
    if (bonus ==0f){
        println("Cargo incorreto.")
    }
}