package arrays

fun main(){

    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67) //intArrayOf com ele não precisamos colocar a quatidade quantas idades o array terá
    val maiorIdade = idades.max() //função max olha para o array e traz o máximo nele
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.min()
    println("Menor idade: $menorIdade")

    val media = idades.average() // calculando media das idades
    println("Média: $media")

    val todosMaiores = idades.all { it > 18 } //se todos os elementos satisfizerem essa operação vai retornar true, se pelo menos um não satisfizer retornará false
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades.any{it >= 18 } //o any é de "qualquer", então se qualquer um dos valores satisfizerem a condição , se pelo menos um estiver dentro da condição então existe aluno maior que 18
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores = idades.filter { it >=18 } //filter vai retornar uma lista com todos os que forem maiores que 18
    println("Maiores: $maiores")

    val busca = idades.find{ it >= 18 } //vai retornar o primeiro valor que satisfaça a condição
    println("Busca: $busca")


}