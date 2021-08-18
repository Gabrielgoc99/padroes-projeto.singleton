
public class Marca {

    private Marca() {
    }

    ;
    private static Marca instance = new Marca();

    public static Marca getInstance() {
        return instance;
    }

    private String nomeMarca;
    private String nomeConcessionaria;


    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getNomeConcessionaria() {
        return nomeConcessionaria;
    }

    public void setNomeConcessionaria(String nomeConcessionaria) {
        this.nomeConcessionaria = nomeConcessionaria;
    }
}