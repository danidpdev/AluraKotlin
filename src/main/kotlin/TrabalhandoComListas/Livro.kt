package TrabalhandoComListas

//data já cria em tempo de compilação o toString, toEquals, hashCode automaticamente para cada váriavel
data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
):Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
      return this.anoPublicacao.compareTo(other.anoPublicacao) //O criterio escolhido foi ano de publicação
    }
}