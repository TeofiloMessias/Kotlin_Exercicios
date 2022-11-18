// Ana  - 500 + 500 * 0.2
// Paula - 500 * 0.8

fun main(){
    var salario = 10000f
    var patrimonioAna = 0f
    var patrimonioPaula = 0f
    var mes = 0

    do {
        patrimonioAna +=(salario * 0.05f) + (salario * 0.05f) + (patrimonioAna * 0.002f)
        patrimonioPaula +=(salario * 0.05f)+ (patrimonioPaula * 0.008f)
        mes++

        println("Ana - $patrimonioAna")
        println("Ana - $patrimonioPaula")
        println("Pat Ana - $patrimonioAna ---------- Pat Paula $patrimonioPaula")
    }while (patrimonioAna > patrimonioPaula )
     println("Paula vai passar o patrimonio de Ana no mês $mes ")
    }