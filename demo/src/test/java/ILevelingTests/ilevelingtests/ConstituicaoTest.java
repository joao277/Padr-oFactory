package ILevelingTests.ilevelingtests;


import ILeveling.ileveling.ILeveling;
import ILeveling.ileveling.ILevelingFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class ConstituicaoTest {
    @Test
    void boraUpar(){
        ILeveling constituicao = ILevelingFactory.getAtributo("Constituição");
        assertEquals("O personagem deseja upar sua Constituição", constituicao.upar());
    }

    @Test
    void pararUp(){
        ILeveling constituicao = ILevelingFactory.getAtributo("Constituição");
        assertEquals("O personagem deseja parar de upar sua Constituição", constituicao.parar());
    }
}