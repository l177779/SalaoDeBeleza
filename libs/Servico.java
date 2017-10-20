package libs;

/**
 * 
 * @author guilherme
 */
public class Servico extends ItemVenda {
    
    private int duracao;
    private Produto produto;

    /**
     * 
     * @param codigo
     * @param descricao
     * @param preco
     * @param duracao 
     * @param produto 
     */
    public Servico(String codigo, String descricao, double preco, int duracao, Produto produto) {
        super(codigo, descricao, preco);
        this.setDuracao(duracao);
        this.setProduto(produto);
    }
    
    /**
     * 
     * @return
     */
    public int getDuracao() {
        return this.duracao;
    }

    /**
     * 
     * @param duracao 
     */
    public final void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public final void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
