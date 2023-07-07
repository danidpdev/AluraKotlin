package arrays

import OperacoesCompostas.bigDecimalArrayOf
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
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)//setScale limita a quatidade de casas decimais e o roundingMode é o arredondamento
            }
        }
        .toTypedArray() //estou pegando os salarios, mapeando cada salario para o salario * um aumento e convertendo
                        //para um array de volta
    println(salariosComAumento.toString())

}

//vamos construir um array e passar os valores dentro dele, a quantidade do array vai variar com a qtd
// de valores que passar dentro do array, por isso
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    } //i = indice do array e utilizamos esse indice para navegar dentro dos valores que estão sendo passados
    //como parametros
}


