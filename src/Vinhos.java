/**
 * @author Ismael Alves
 */


public class Vinhos {

    private String rose;

    private String tinto;//modificado de acesso - private

    public String getRose() {
        return rose;
        //retorna o valor rose

    }

    public void setRose(String rose) {
        this.rose = rose;
    }

    public String getTinto() {
        return tinto;
    }

    public void setTinto(String tinto) {
        this.tinto = tinto;
    }

    public void selecionarVinho(String rose){

        setRose(rose);
    }

    /**
     * @deprecated
     */
    public void teste (){

    }


}
