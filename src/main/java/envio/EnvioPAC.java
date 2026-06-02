package envio;

public class EnvioPAC extends ProcessadorPedido{

    @Override
    public void calcularFrete(double valorFrete) {
        frete = valorFrete;
    }

    @Override
    public void gerarCodigo() {
        codigo = "Gerando código PAC";
    }
}