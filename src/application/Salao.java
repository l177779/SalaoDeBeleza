package application;

/**
 *
 * @author guilherme
 */
public class Salao {

    private static String nome;
    private static String endereco;
    private static String telefone;

    /**
     * @return String nome
     */
    public static String getNome() {
        return Salao.nome;
    }

    /**
     * @param nome String
     */
    public final static void setNome(String nome) {
        Salao.nome = nome;
    }        

    /**
     * @return String endereco
     */
    public static String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco String
     */
    public static void setEndereco(String endereco) {
        Salao.endereco = endereco;
    }

    /**
     * @return String telefone
     */
    public static String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone String
     */
    public static void setTelefone(String telefone) {
        Salao.telefone = telefone;
    }
}