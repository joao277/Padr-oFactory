package ILevelingTests.ilevelingtests;


import ILeveling.ileveling.ILeveling;
import ILeveling.ileveling.ILevelingFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class DestrezaTest {
    @Test
    void boraUpar(){
        ILeveling destreza = ILevelingFactory.getAtributo("Destreza");
        assertEquals("O personagem deseja upar sua Destreza", destreza.upar());
    }

    @Test
    void pararUp(){
        ILeveling destreza = ILevelingFactory.getAtributo("Destreza");
        assertEquals("O personagem deseja parar de upar sua Destreza", destreza.parar());
    }
}