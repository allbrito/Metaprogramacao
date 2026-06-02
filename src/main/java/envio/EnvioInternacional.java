package envio;

public class EnvioInternacional extends ProcessadorPedido{

    @Override
    public void calcularFrete(double valorFrete) {
        frete = valorFrete + (valorFrete * imposto());
    }

    @Override
    public void gerarCodigo() {
        codigo = "Gerando código internacional";
    }

    private double imposto() {
        return 0.2;
    }
}