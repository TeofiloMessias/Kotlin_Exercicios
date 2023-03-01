/*
Exercicio 1 ->
    Escreva uma função qie seja capaz de receber a quantidade de anos e transformar em meses, dias,
    horas, minutos e segundos. Saida desejada
    2 anos equivalem a:
    24 meses
    730 dias
    17520 horas
    1051200 minutos
    63072000 segundos
 */
/*
Exercicio 2 ->
    Escreva uma função caps de receber uma string e retornar a quantidade de caracteres */
/*
Exercicio 3 ->
    Escreva uma função capaz de calcular o cubo de um numero inteiro
 */
/*
Exercico 4
    Escreva uma função capaz de receber e converter em Km(1 milha = 1.6km). */
/*
Exercicio 5
   A- Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras 'a' ou 'A'
    por 'X'
   B- Não deve existir logica dentro da função main.Deve ser usada somente como ponto de entrada.
   C- Escrever uma função para a troca de letras e impressão do valor final
   D- String final deve estar com todas as letras minusculas.  */
/*
Exercicio 6
    Sobre as funções criadas nos exercicios 2, 3, e 4. É possível transforma-las em funções de uma unica
    linha? Se sim, transforme-as */
fun converteAnos(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}
fun caracteres(str: String) = str.length
fun cubo(n:Int) = n * n * n
fun milhasKm(milhas:Float) = milhas * 1.6f
fun ex5(str: String){
   // println(str.replace("A","x").replace("a","x").lowercase())
  //  print(str.lowercase().replace("a","x"))
    print(str.replace("a","x", true).lowercase())
}

    fun main() {
        println("Exercicio 1 ->")
        converteAnos(2)
        println("Exercicio 2 ->")
        println( caracteres("Teofilo"))
        println("Exercicio 3 ->")
        println(cubo(3))
        println("Exercicio 4 ->")
        println(milhasKm(100f))
        println("Exercicio 5 ->")
        println( ex5("AAad sfasger aaaaa bdgbnymi   crtyuiu6lj"))
    }