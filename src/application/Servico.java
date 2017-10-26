package application;

/**
 * 
 * @author guilherme
 */
public class Servico extends ItemVenda {

    private int duracao;
    private Produto produto;

    /**
     * Construtor de servico
     * @param codigo identificador do servico
     * @param descricao descricao do servico
     * @param preco preco do servico
     * @param duracao duracao do servico
     * @param produto produto utilizado no servico
     */
    public Servico(String codigo, String descricao, double preco, int duracao, Produto produto) {
        super(codigo, descricao, preco);
        this.setDuracao(duracao);
        this.setProduto(produto);
    }

    /**
     * @return int duracao
     */
    public int getDuracao() {
        return this.duracao;
    }

    /**
     * @param duracao int
     */
    public final void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /**
     * @return Produto produto
     */
    public Produto getProduto() {
        return this.produto;
    }

    /**
     * @param produto Produto
     */
    public final void setProduto(Produto produto) {
        this.produto = produto;
    }
}