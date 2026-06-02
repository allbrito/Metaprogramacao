package reflexao;

import anotacao.TipoEnvio;
import envio.ProcessadorPedido;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegistroProcessador {

    private static final Map<Integer, Class<? extends ProcessadorPedido>> PROCESSADORES_POR_CODIGO = new HashMap<>();

    static {
        // Varre o pacote "envio" em busca de classes anotadas com @TipoEnvio
        Reflections reflections = new Reflections("envio");
        Set<Class<?>> classesAnotadas = reflections.getTypesAnnotatedWith(TipoEnvio.class);

        for (Class<?> clazz : classesAnotadas) {
            if (ProcessadorPedido.class.isAssignableFrom(clazz)) {
                TipoEnvio anotacao = clazz.getAnnotation(TipoEnvio.class);
                int codigo = anotacao.codigo();
                @SuppressWarnings("unchecked")
                Class<? extends ProcessadorPedido> processadorClass = (Class<? extends ProcessadorPedido>) clazz;
                PROCESSADORES_POR_CODIGO.put(codigo, processadorClass);
            }
        }
    }

    public static ProcessadorPedido obterProcessador(int tipoEscolhido) {
        Class<? extends ProcessadorPedido> classeEncontrada = PROCESSADORES_POR_CODIGO.get(tipoEscolhido);
        if (classeEncontrada == null) {
            throw new IllegalArgumentException("Código de envio não suportado: " + tipoEscolhido);
        }
        return instanciar(classeEncontrada);
    }

    private static ProcessadorPedido instanciar(Class<? extends ProcessadorPedido> classe) {
        try {
            return classe.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar o processador via Reflexão", e);
        }
    }
}
