package OperacoesCompostas

import java.math.BigDecimal

//vamos construir um array e passar os valores dentro dele, a quantidade do array vai variar com a qtd
// de valores que passar dentro do array, por isso
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    } //i = indice do array e utilizamos esse indice para navegar dentro dos valores que estão sendo passados
    //como parametros
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor  ->
        acumulador + valor // o reduce reduzir nosso array em um valor unico. Assim ele vai iterar por cada valor do array,a cada valor do array vai somar com o acumulador
        // e passar para a proxima iteração sempre somando esse acumulador. Assim ele vai ver que o primeiro valor
        // é 1500 e assim acumula e soma com o próximo valor
    } // reduce recebe uma função que tem como parametro um acumulador e um valor. O valor é o valor do
    // array que estamos iterando e assim cada valor do array vai vir por esse parametro e o acumulador é a OperacoesCompostas.somatoria de cada iteração
    //
} //existe a função sum que soma o que colocaemos, porem para bigdecima nao existe e assim temos que criar a nossa propria.
//reduce


fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}
