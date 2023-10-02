/**
 * @author Ismael Alves
 */
public class Produto {

    private int codigo;

    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void selecionarQuant (int quantidade){
        setQuantidade(1);
    }

}

