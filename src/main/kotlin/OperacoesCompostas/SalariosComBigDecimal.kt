package OperacoesCompostas

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){

    //BigDecimna não é o tipo primitivo , mas ele traz o retorno exato, o double é um tipo e ponto flutuante
    //e faz algumas aproximações para valores decimais. O BigDecimal consegue garantir que os valores decimais sejam extaamente
    //o que eles são. BigDecimal não tem array, por não ser primitvo.

//    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO } //Isso cria um array de cinco posições inciiados com 0 [0, 0, 0, 0, 0]
//    salarios[0] = "1500.55".toBigDecimal()// para construir um bigDecimal com valor exato a forma mais pratica é utilizando uma string
//    salarios[1] = "2000.00".toBigDecimal()
//    println(salarios.contentToString())

    val salarios = bigDecimalArrayOf("1500.55", "2000.00") //aqui ele está criando o array de forma dinamica
    println(salarios.contentToString())

    //vai percorrer cada salario e atriburi cada valor para o proprio array do salarios. Mas iremos criar
    // um array novo com o aumento. Map serve para mapear os valores de um lugar para o outro, então vou
    // pegar os salarios originais e mapear para uma nova lista que vai conter os valores com aumento.
    // Assim como o forEach o map recebe uma variavel que é o valor de cada salario, o map também. Diferente do
    //forEach ele retorna um novo array um outro tipo de conjunto

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento)} //fiz extract com o extract method
        .toTypedArray() //estou pegando os salarios, mapeando cada salario para o salario * um aumento e convertendo
                        //para um array de volta
    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    } //parecido com o reduce, porém recebe um valor inicial e assim como o reduce tem um acumulador e um valor.
      //O folder usei para informar qual o gasto inicial e daqui 6 meses qual o gasto total

    println(gastoTotal)

//    val salariosOrdenados = salariosComAumento.sorted()//sorted ele ordena do maior para o menor
//    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3)
//        .toTypedArray() //take pega os 3 primeiros valores e se quiser os 3 ultimos é o takeLast
//    val media = tresUltimosSalarios.media()
    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media() //reduzindo codigo acima por este
    println(media)

    val mediaMenoresSalarios = salariosComAumento.take(3).toTypedArray().media()

    println(mediaMenoresSalarios)
}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(
        2,
        RoundingMode.UP
    )//setScale limita a quatidade de casas decimais e o roundingMode é o arredondamento
}






