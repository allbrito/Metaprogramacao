package envio;

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