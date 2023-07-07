package TrabalhandoComListas

import sun.rmi.transport.LiveRef

val listaDeLivros: MutableList<Livro> = mutableListOf(

   Livro(
        titulo = "Minha vida de menino",
autor = "Helton Morley",
anoPublicacao = 1942,
editora = "Editora A"
),

 Livro(
    titulo = "Minha vida de menina",
    autor = "Helena Morley",
    anoPublicacao = 1942,
    editora = "Editora B"
)
,
 Livro(
    titulo = "Minha vida de menina",
    autor = "Helen Morley",
    anoPublicacao = 1942,

    )
)


val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Minha vida de menino",
        autor = "Helton Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora B"
    ),
    null
    ,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helen Morley",
        anoPublicacao = 1942,

        )
)
