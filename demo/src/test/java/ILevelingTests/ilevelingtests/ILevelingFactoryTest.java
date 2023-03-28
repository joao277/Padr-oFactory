package ILevelingTests.ilevelingtests;

import org.junit.jupiter.api.Test;

import ILeveling.ileveling.ILeveling;
import ILeveling.ileveling.ILevelingFactory;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaAtributoInexistente() {
        try {
            ILeveling leveling = ILevelingFactory.getAtributo("Rebolado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Atributo não existe.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            ILeveling leveling = ILevelingFactory.getAtributo("Carisma");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Este atributo ainda não está disponivel para ser nivelado", e.getMessage());
        }
    }
}
