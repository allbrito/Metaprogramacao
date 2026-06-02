package envio;

public class EnvioSedex extends ProcessadorPedido{

    @Override
    public void calcularFrete(double valorFrete) {
        frete = valorFrete + (valorFrete * adicionalRapidez());
    }

    @Override
    public void gerarCodigo() {
        codigo = "Gerando código Sedex";
    }

    private double adicionalRapidez() {
        return 0.07;
    }
}