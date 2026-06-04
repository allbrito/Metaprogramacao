package envio;

import anotacao.TipoEnvio;

@TipoEnvio(codigo = 2)
public class EnvioSedex extends ProcessadorPedido{

    @Override
    protected void calcularFrete(double valorFrete) {
        frete = valorFrete + (valorFrete * adicionalRapidez());
    }

    @Override
    protected void gerarCodigo() {
        codigo = "Gerando código Sedex";
    }

    private double adicionalRapidez() {
        return 0.07;
    }
}