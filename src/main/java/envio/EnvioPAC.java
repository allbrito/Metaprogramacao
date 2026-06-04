package envio;

import anotacao.TipoEnvio;

@TipoEnvio(codigo = 1)
public class EnvioPAC extends ProcessadorPedido{

    @Override
    protected void calcularFrete(double valorFrete) {
        frete = valorFrete;
    }

    @Override
    protected void gerarCodigo() {
        codigo = "Gerando código PAC";
    }
}