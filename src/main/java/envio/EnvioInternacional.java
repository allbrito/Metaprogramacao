package envio;

public class EnvioInternacional extends ProcessadorPedido{

    @Override
    protected void calcularFrete(double valorFrete) {
        frete = valorFrete + (valorFrete * imposto());
    }

    @Override
    protected void gerarCodigo() {
        codigo = "Gerando código internacional";
    }

    private double imposto() {
        return 0.2;
    }
}