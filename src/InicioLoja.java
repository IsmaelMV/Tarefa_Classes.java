/**
 * @author Ismael Alves
 *
 */

public class InicioLoja {
    /**
     *
     * @param args valores do sistema
     */
    public static void main (String args[]) {
       System.out.println("Olá Sejam Bem Vindos a VINHO E PONTO!!");

        Cliente  cliente = new Cliente ();
        cliente.qualNome("Ismael");
        System.out.println(cliente.getNome());

        Produto  produto = new Produto();
        produto.setQuantidade(1);
        System.out.println(produto.getQuantidade());

        Vinhos  vinhos = new Vinhos();
        vinhos.setRose("Rose");
        System.out.println(vinhos.getRose());// imprimi
    }


}
