import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarcaTest {

    @Test
    public void deveRetornarNomeMarca() {
        Marca.getInstance().setNomeMarca("Ford");
        assertEquals("Ford", Marca.getInstance().getNomeMarca());
    }

    @Test
    public void deveRetornarNomeConcessionaria() {
        Marca.getInstance().setNomeConcessionaria("JF_Carros");
        assertEquals("JF_Carros", Marca.getInstance().getNomeConcessionaria());
    }

}