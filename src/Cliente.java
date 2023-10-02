/**
 * @author Ismael Alves
 */
public class Cliente {

    private int codigo;

    private String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void qualNome(String nome) {

        setNome(nome);
    }

    /**
     * @return retornar o valor total
     * @deprecated Método que faz o calculo do valor total
     */
    public int getValor() {
        return 10;
    }

    /**
     * @param count
     * @return
     */
    public int getValorTotal(int count) {
        return 30;


    }
}