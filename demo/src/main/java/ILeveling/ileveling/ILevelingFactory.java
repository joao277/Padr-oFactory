package ILeveling.ileveling;

public class ILevelingFactory {
    
    public static ILeveling getAtributo(String atributo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("ileveling." + atributo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Este Atributo não existe.");
        }
        if (!(objeto instanceof ILeveling)) {
            throw new IllegalArgumentException("Atributo inválido. A opção de upar esse atributo ainda não existe.");
        }
        return (ILeveling) objeto;
    }

}
