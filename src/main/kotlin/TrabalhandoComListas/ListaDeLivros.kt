package TrabalhandoComListas

fun main() {
    val livro1 = Livro(
        titulo = "Minha vida de menino",
        autor = "Helton Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora B"
    )

    val livro3 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helen Morley",
        anoPublicacao = 1942,

    )

    //Vamos colocar os objetos acima em uma lista

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3) //isso significa uma lista mútavel de livros
        //o MutableList receber um generico entre <> e para adicionar dentro dessa lista, podemos usar o add.

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimaraes Rosa",
            anoPublicacao = 1946
        )
    ) //diferente do array não precisamos passar o tamanho da lista. O add espera um valor generico do tipo que passarmos na
      //mutableList no nosso caso Livro

    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicacao: List<Livro> = livros.sorted()
    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadaPorTitulo = livros.sortedBy{ it.titulo }
    ordenadaPorTitulo.imprimeComMarcadores()

    val ordenadorPorAutor = livros.sortedBy { it.autor }
    ordenadorPorAutor.imprimeComMarcadores()

    //pegando lista de livros, filtrando pelo nome do autor
    listaDeLivros
        .filter{ it.autor == "João Guimarães Rosa" }//como estamos dentro do contexto de  livro, ir ele vai representar um autor
        .filter{ it.autor.startsWith("João") }//outra forma de filtrar sem ser pelo nome inteiro
        .sortedBy { it.anoPublicacao}
        .imprimeComMarcadores()

//    val titulos: List<String> = listaDeLivros
//        .filter{ it.autor == "João Guimarães Rosa" }//como estamos dentro do contexto de  livro, ir ele vai representar um autor
//        .filter{ it.autor.startsWith("João") }//outra forma de filtrar sem ser pelo nome inteiro
//        .sortedBy { it.anoPublicacao}
//        .map{ it.titulo}
}

