package ILevelingTests.ilevelingtests;


import ILeveling.ileveling.ILeveling;
import ILeveling.ileveling.ILevelingFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ForcaTest {
    @Test
    void boraUpar(){
        ILeveling forca = ILevelingFactory.getAtributo("Força");
        assertEquals("O personagem deseja upar sua Força", forca.upar());
    }

    @Test
    void pararUp(){
        ILeveling forca = ILevelingFactory.getAtributo("Forca");
        assertEquals("O personagem deseja parar de upar sua Força", forca.parar());
    }
}