package envio;

import anotacao.TipoEnvio;

@TipoEnvio(codigo = 1)
public class EnvioPAC extends ProcessadorPedido{

    @Override
    public void calcularFrete(double valorFrete) {
        frete = valorFrete;
    }

    public void gerarCodigo() {
        codigo = "Gerando código PAC";
    }
}