package TrabalhandoComListas

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n"){
        " - ${it?.titulo} de ${it?.autor}" //? é o null safem só chame o atributo se for nulo
    } //ele recebe uma função que recebe cada elemento do livro e decidimos como queremos imprimir cada
    //elemento do livro dentro dessa lista de livros. Neste caso, para separar um valor e outro
    //irá pular uma linha
    println("#### Lista de llivros #### \n$textoFormatado")
}