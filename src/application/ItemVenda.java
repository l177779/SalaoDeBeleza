package application;

/**
 *
 * @author guilherme
 */
public abstract class ItemVenda {

    protected String codigo;
    protected String descricao;
    protected double preco;

    /**
     * Construtor do ItemVenda
     * @param codigo identificador do ItemVenda
     * @param descricao descricao do ItemVenda
     * @param preco preco do ItemVenda
     */
    public ItemVenda(String codigo, String descricao, double preco) {
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setPreco(preco);
    }

    /**
     * @return String codigo
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @param codigo String
     */
    public final void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String descricao
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * @param descricao String
     */
    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return double preco
     */
    public double getPreco() {
        return this.preco;
    }

    /**
     * @param preco double
     */
    public final void setPreco(double preco) {
        this.preco = preco;
    }
}